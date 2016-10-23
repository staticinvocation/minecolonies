package com.compatibility;

import com.compatibility.tinkers.ToolBrokenCheck;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.Nullable;

/**
  * This class is to store the methods that call the methods to check for miscellaneous compatibility problems.
  */
public class Compatibility
{

    private Compatibility()
    {
        throw new IllegalAccessError("Utility class");
    }

    /**
      * This method checks to see if STACK is able to mine anything.
      * It goes through all compatibility checks.
      *
      * @param stack the item in question.
      * @param tool the name of the tool.
      * @return boolean whether the stack can mine or not.
      */
    public static boolean checkMiningCompatibility(@Nullable ItemStack stack, @Nullable String tool)
    {
        if (ToolBrokenCheck.checkTinkersBroken(stack))
        {
            return true;
        }
        return false;
    }
}
