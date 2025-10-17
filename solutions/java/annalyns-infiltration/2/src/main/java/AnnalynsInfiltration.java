class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake || prisonerIsAwake);
        // return false;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return (prisonerIsAwake && !archerIsAwake);
        // return false;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (!archerIsAwake && ( petDogIsPresent || (!knightIsAwake && prisonerIsAwake) ));
        // if(petDogIsPresent && !archerIsAwake) return true;
        // if(!knightIsAwake && !archerIsAwake && prisonerIsAwake) return true;
        // return false;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }
}
