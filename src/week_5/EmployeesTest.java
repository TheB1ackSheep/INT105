/*
 * Copyright (C) 2014 INT105
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package week_5;

/**
 *
 * @author INT105
 */
public class EmployeesTest {
    public static void main(String[] args) {
        Employees es = new Employees();
        while(es.hasNext())
            System.out.println(es.next());
        for(Employee e : es)
            System.out.println(e);
    }
}
