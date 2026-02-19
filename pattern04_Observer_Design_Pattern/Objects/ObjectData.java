package src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects;

import java.util.Date;

public class ObjectData {
      private final long timeStamp;
      private final String objectName;

      public ObjectData(String objectName) {
            this.objectName = objectName;
            this.timeStamp=System.currentTimeMillis();
      }

      public long getTimeStamp() {
            return timeStamp;
      }

      public String getObjectName() {
            return objectName;
      }

    public String toString() {
          return (" No values given ");
    }

      public void graph() {
            System.out.println(" Create some graph ");
      }
}
