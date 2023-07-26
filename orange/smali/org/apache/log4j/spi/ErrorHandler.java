public abstract class org.apache.log4j.spi.ErrorHandler implements org.apache.log4j.spi.OptionHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # virtual methods */
	 public abstract void error ( java.lang.String p0 ) {
	 } // .end method
	 public abstract void error ( java.lang.String p0, java.lang.Exception p1, Integer p2 ) {
	 } // .end method
	 public abstract void error ( java.lang.String p0, java.lang.Exception p1, Integer p2, org.apache.log4j.spi.LoggingEvent p3 ) {
	 } // .end method
	 public abstract void setAppender ( org.apache.log4j.Appender p0 ) {
	 } // .end method
	 public abstract void setBackupAppender ( org.apache.log4j.Appender p0 ) {
	 } // .end method
	 public abstract void setLogger ( org.apache.log4j.Logger p0 ) {
	 } // .end method
