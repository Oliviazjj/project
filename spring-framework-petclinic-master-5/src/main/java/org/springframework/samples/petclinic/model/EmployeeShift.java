/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Simple JavaBean domain object representing a employeShift.
 *
 * @author Ken Krebs
 */
@Entity
@Table(name = "employeShifts")
public class EmployeeShift extends BaseEntity {

    /**
     * Holds value of property date.
     */
    @Column(name = "employeShift_date")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date date;

    /**
     * Holds value of property description.
     */
    @NotEmpty
    @Column(name = "description")
    private String description;

    /**
     * Holds value of property employEvent.
     */
    @ManyToOne
    @JoinColumn(name = "employEvent_id")
    private EmployEvent employEvent;


    /**
     * Creates a new instance of EmployeShift for the current date
     */
    public EmployeeShift() {
        this.date = new Date();
    }


    /**
     * Getter for property date.
     *
     * @return Value of property date.
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Setter for property date.
     *
     * @param date New value of property date.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Getter for property description.
     *
     * @return Value of property description.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for property description.
     *
     * @param description New value of property description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for property employEvent.
     *
     * @return Value of property employEvent.
     */
    public EmployEvent getEmployEvent() {
        return this.employEvent;
    }

    /**
     * Setter for property employEvent.
     *
     * @param employEvent New value of property employEvent.
     */
    public void setEmployEvent(EmployEvent employEvent) {
        this.employEvent = employEvent;
    }

}