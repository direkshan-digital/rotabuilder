package com.rotabuilder.dom.domain.contract;

public enum ContractLineType {
    SINGLE_ASSIGNMENT_PER_DAY,
    TOTAL_ASSIGNMENTS,
    CONSECUTIVE_WORKING_DAYS,
    CONSECUTIVE_FREE_DAYS,
    CONSECUTIVE_WORKING_WEEKENDS,
    TOTAL_WORKING_WEEKENDS_IN_FOUR_WEEKS,
    COMPLETE_WEEKENDS,
    IDENTICAL_SHIFT_TYPES_DURING_WEEKEND,
    NO_NIGHT_SHIFT_BEFORE_FREE_WEEKEND,
    ALTERNATIVE_SKILL_CATEGORY
}
