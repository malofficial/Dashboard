
/*
 Copyright (C) 2016 Quaternion Risk Management Ltd
 All rights reserved.

 This file is part of ORE, a free-software/open-source library
 for transparent pricing and risk analysis - http://opensourcerisk.org

 ORE is free software: you can redistribute it and/or modify it
 under the terms of the Modified BSD License.  You should have received a
 copy of the license along with this program.
 The license is also available online at <http://opensourcerisk.org>

 This program is distributed on the basis that it will form a useful
 contribution to risk analytics and model standardisation, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 FITNESS FOR A PARTICULAR PURPOSE. See the license for more details.
*/

package app.graph;

import app.util.DashBoardException;

import java.util.Set;

import static app.Application.cache;

public class XvaDao {

    public Set<String> getXvaLinks() {
        return cache.getXvaLinks();
    }

    public Xva getXva(String date, String hierarchy, String metric) throws DashBoardException {
        return cache.getXva(date, hierarchy, metric);
    }

    public Set<String> getXvaTreeLinks() {
        return cache.getXvaTreeLinks();
    }

    public Xva getXvaTree(String date, String hierarchy, String item, String metric) throws DashBoardException {
        return cache.getXvaTree(date, hierarchy, item, metric);
    }
}

