/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 */

package org.eclipse.xpanse.modules.models.servicetemplate.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.eclipse.xpanse.modules.models.common.exceptions.UnsupportedEnumValueException;
import org.junit.jupiter.api.Test;

class ServiceTemplateRegistrationStateTest {

    @Test
    void testGetByValue() {
        assertEquals(ServiceTemplateRegistrationState.IN_PROGRESS,
                ServiceTemplateRegistrationState.getByValue("in-progress"));
        assertEquals(ServiceTemplateRegistrationState.APPROVED,
                ServiceTemplateRegistrationState.getByValue("approved"));
        assertEquals(ServiceTemplateRegistrationState.REJECTED,
                ServiceTemplateRegistrationState.getByValue("rejected"));
        assertThrows(UnsupportedEnumValueException.class,
                () -> ServiceTemplateRegistrationState.getByValue("error_value"));
        assertThrows(UnsupportedEnumValueException.class,
                () -> ServiceTemplateRegistrationState.getByValue(null));

    }

    @Test
    void testToValue() {
        assertEquals("in-progress", ServiceTemplateRegistrationState.IN_PROGRESS.toValue());
        assertEquals("approved", ServiceTemplateRegistrationState.APPROVED.toValue());
        assertEquals("rejected", ServiceTemplateRegistrationState.REJECTED.toValue());
    }
}
