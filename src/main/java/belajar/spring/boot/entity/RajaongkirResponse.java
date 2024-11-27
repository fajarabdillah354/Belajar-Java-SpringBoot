package belajar.spring.boot.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RajaongkirResponse {

    private Query query;
    private Status status;
    private List<Result> results;

    // Getter, Setter, Constructor

    public static class Query {
        private String origin;
        private String destination;
        private int weight;
        private String courier;

        public Query(String s, String s1, int i, String jne) {

        }

        // Getter, Setter, Constructor
    }

    public static class Status {
        private int code;
        private String description;

        // Getter, Setter, Constructor
    }

    public static class Result {
        private String code;
        private String name;
        private List<Cost> costs;

        // Getter, Setter, Constructor

        public static class Cost {
            private String service;
            private String description;
            private List<CostDetail> cost;

            // Getter, Setter, Constructor



            public static class CostDetail {
                private int value;
                private String etd;
                private String note;

                // Getter, Setter, Constructor
            }
        }
    }


}
