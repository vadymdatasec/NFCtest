public abstract class org.apache.log4j.Appender {
	 /* .source "SourceFile" */
	 /* # virtual methods */
	 public abstract void addFilter ( org.apache.log4j.spi.Filter p0 ) {
	 } // .end method
	 public abstract void clearFilters ( ) {
	 } // .end method
	 public abstract void close ( ) {
	 } // .end method
	 public abstract void doAppend ( org.apache.log4j.spi.LoggingEvent p0 ) {
	 } // .end method
	 public abstract org.apache.log4j.spi.ErrorHandler getErrorHandler ( ) {
	 } // .end method
	 public abstract org.apache.log4j.spi.Filter getFilter ( ) {
	 } // .end method
	 public abstract org.apache.log4j.Layout getLayout ( ) {
	 } // .end method
	 public abstract java.lang.String getName ( ) {
	 } // .end method
	 public abstract Boolean requiresLayout ( ) {
	 } // .end method
	 public abstract void setErrorHandler ( org.apache.log4j.spi.ErrorHandler p0 ) {
	 } // .end method
	 public abstract void setLayout ( org.apache.log4j.Layout p0 ) {
	 } // .end method
	 public abstract void setName ( java.lang.String p0 ) {
	 } // .end method
