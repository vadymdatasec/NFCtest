public abstract class org.apache.log4j.spi.LoggerRepository {
	 /* .source "SourceFile" */
	 /* # virtual methods */
	 public abstract void addHierarchyEventListener ( org.apache.log4j.spi.HierarchyEventListener p0 ) {
	 } // .end method
	 public abstract void emitNoAppenderWarning ( org.apache.log4j.Category p0 ) {
	 } // .end method
	 public abstract org.apache.log4j.Logger exists ( java.lang.String p0 ) {
	 } // .end method
	 public abstract void fireAddAppenderEvent ( org.apache.log4j.Category p0, org.apache.log4j.Appender p1 ) {
	 } // .end method
	 public abstract java.util.Enumeration getCurrentCategories ( ) {
	 } // .end method
	 public abstract java.util.Enumeration getCurrentLoggers ( ) {
	 } // .end method
	 public abstract org.apache.log4j.Logger getLogger ( java.lang.String p0 ) {
	 } // .end method
	 public abstract org.apache.log4j.Logger getLogger ( java.lang.String p0, org.apache.log4j.spi.LoggerFactory p1 ) {
	 } // .end method
	 public abstract org.apache.log4j.Logger getRootLogger ( ) {
	 } // .end method
	 public abstract org.apache.log4j.Level getThreshold ( ) {
	 } // .end method
	 public abstract Boolean isDisabled ( Integer p0 ) {
	 } // .end method
	 public abstract void resetConfiguration ( ) {
	 } // .end method
	 public abstract void setThreshold ( java.lang.String p0 ) {
	 } // .end method
	 public abstract void setThreshold ( org.apache.log4j.Level p0 ) {
	 } // .end method
	 public abstract void shutdown ( ) {
	 } // .end method
