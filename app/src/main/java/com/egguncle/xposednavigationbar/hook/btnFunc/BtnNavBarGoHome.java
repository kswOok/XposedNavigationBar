/*
 *     Navigation bar function expansion module
 *     Copyright (C) 2017 egguncle cicadashadow@gmail.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.egguncle.xposednavigationbar.hook.btnFunc;

import android.support.v4.view.ViewPager;
import android.view.View;

import com.egguncle.xposednavigationbar.hook.hookFunc.GoHomeNavBar;

/**
 * Created by egguncle on 17-6-10.
 */

public class BtnNavBarGoHome implements GoHomeNavBar,View.OnClickListener {
    private ViewPager mViewPager;
    public BtnNavBarGoHome(ViewPager viewPager){
        mViewPager=viewPager;
    }

    @Override
    public void onClick(View view) {
        goHomeNavBar(mViewPager);
    }

    @Override
    public void goHomeNavBar(ViewPager viewPager) {
        viewPager.setCurrentItem(1);
    }
}
