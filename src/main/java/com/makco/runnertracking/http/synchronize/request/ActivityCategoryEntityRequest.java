package com.makco.runnertracking.http.synchronize.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * User: Makar Kalancha
 * Date: 01/03/2021
 * Time: 14:34
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ActivityCategoryEntityRequest {
    private Long id;

    private String name;

    private String comment;

//    private CreatedUpdatedRequest createdUpdated;
//    private SynchedRequest synched;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivityCategoryEntityRequest that = (ActivityCategoryEntityRequest) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, comment);
    }

//    @Override
//    public String toString() {
//        return "ActivityCategoryRequest{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", comment='" + comment + '\'' +
//                ", createdUpdated=" + createdUpdated +
//                ", synched=" + synched +
//                '}';
//    }
}

