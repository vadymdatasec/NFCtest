public class org.apache.log4j.varia.LevelMatchFilter extends org.apache.log4j.spi.Filter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean a;
	 public org.apache.log4j.Level b;
	 /* # direct methods */
	 public org.apache.log4j.varia.LevelMatchFilter ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/spi/Filter;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/varia/LevelMatchFilter;->a:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer decide ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
	 p1 = 	 (( org.apache.log4j.Priority ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/Priority;->equals(Ljava/lang/Object;)Z
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 /* .line 3 */
		 /* iget-boolean p1, p0, Lorg/apache/log4j/varia/LevelMatchFilter;->a:Z */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_1
		 int p1 = -1; // const/4 p1, -0x1
	 } // :cond_2
} // .end method
public Boolean getAcceptOnMatch ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Lorg/apache/log4j/varia/LevelMatchFilter;->a:Z */
} // .end method
public java.lang.String getLevelToMatch ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 /* if-nez v0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :cond_0
(( org.apache.log4j.Priority ) v0 ).toString ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Priority;->toString()Ljava/lang/String;
} // :goto_0
} // .end method
public void setAcceptOnMatch ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/varia/LevelMatchFilter;->a:Z */
return;
} // .end method
public void setLevelToMatch ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
org.apache.log4j.helpers.OptionConverter .toLevel ( p1,v0 );
this.b = p1;
return;
} // .end method
