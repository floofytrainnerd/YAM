package floofytrainnerd.yam.entity.ai;

import floofytrainnerd.yam.entity.monster.EntityTestEntity;
import net.minecraft.entity.ai.EntityAIAttackMelee;

public class EntityAITestEntityAttack extends EntityAIAttackMelee {
    private int raiseArmTicks;
    private EntityTestEntity testEntity;

    public EntityAITestEntityAttack(EntityTestEntity zombieIn, double speedIn, boolean longMemoryIn) {
        super(zombieIn, speedIn, longMemoryIn);
        this.testEntity = zombieIn;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    @Override
    public void startExecuting() {
        super.startExecuting();
        this.raiseArmTicks = 0;
    }

    /**
     * Resets the task
     */
    @Override
    public void resetTask() {
        super.resetTask();
        this.testEntity.setArmsRaised(false);
    }

    /**
     * Updates the task
     */
    @Override
    public void updateTask() {
        super.updateTask();
        ++this.raiseArmTicks;

        if (this.raiseArmTicks >= 5 && this.attackTick < 10) {
            this.testEntity.setArmsRaised(true);
        } else {
            this.testEntity.setArmsRaised(false);
        }
    }
}