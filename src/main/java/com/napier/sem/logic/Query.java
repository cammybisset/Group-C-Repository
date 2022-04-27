package com.napier.sem.logic;

import com.napier.sem.data.City;
import com.napier.sem.data.Country;
import com.napier.sem.data.Language;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Queries Produced from the database
 */
public class Query
    {
            // Create string for SQL statement
            String strSelect =
                    "SELECT NAME, population "
                            + "FROM country c "
                            + "ORDER BY 2 DESC ";
    // Execute SQL statement
    ResultSet rset;
            {
        Country cou = new Country();
        cou.Name = rset.getString("NAME");
        cou.Population = rset.getInt("Population");
            }
    }