/*
 * Copyright (c) [2016] [ <ether.camp> ]
 * This file is part of the ethereumJ library.
 *
 * The ethereumJ library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The ethereumJ library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the ethereumJ library. If not, see <http://www.gnu.org/licenses/>.
 */
package org.ethereum.mine;

import org.ethereum.core.Block;

/**
 * Created by Anton Nashatyrev on 10.12.2015.
 */
public interface MinerListener {

    enum MinerStatus {
        /**
         * Indicates start of light DAG generation
         */
        LIGHT_DAG_GENERATE_START,
        /**
         * Indicates end of light DAG generation
         */
        LIGHT_DAG_GENERATE_END,
        /**
         * Indicates start of full DAG generation
         */
        FULL_DAG_GENERATE_START,
        /**
         * Indicates end of light DAG generation
         */
        FULL_DAG_GENERATE_END,
    }

    void miningStarted();
    void miningStopped();
    void blockMiningStarted(Block block);
    void blockMined(Block block);
    void blockMiningCanceled(Block block);
    void onMinerStatusUpdate(MinerStatus minerStatus);
}
