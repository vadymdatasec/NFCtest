public class org.apache.log4j.varia.LevelRangeFilter extends org.apache.log4j.spi.Filter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean a;
	 public org.apache.log4j.Level b;
	 public org.apache.log4j.Level c;
	 /* # direct methods */
	 public org.apache.log4j.varia.LevelRangeFilter ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/spi/Filter;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->a:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer decide ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 int v1 = -1; // const/4 v1, -0x1
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
			 v2 = this.b;
			 v0 = 			 (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
			 /* if-nez v0, :cond_0 */
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 4 */
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
			 p1 = 			 (( org.apache.log4j.Priority ) p1 ).toInt ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Priority;->toInt()I
			 v0 = this.c;
			 v0 = 			 (( org.apache.log4j.Priority ) v0 ).toInt ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Priority;->toInt()I
			 /* if-le p1, v0, :cond_1 */
			 /* .line 5 */
		 } // :cond_1
		 /* iget-boolean p1, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->a:Z */
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_2
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public Boolean getAcceptOnMatch ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->a:Z */
	 } // .end method
	 public org.apache.log4j.Level getLevelMax ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
	 } // .end method
	 public org.apache.log4j.Level getLevelMin ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public void setAcceptOnMatch ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput-boolean p1, p0, Lorg/apache/log4j/varia/LevelRangeFilter;->a:Z */
		 return;
	 } // .end method
	 public void setLevelMax ( org.apache.log4j.Level p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 return;
	 } // .end method
	 public void setLevelMin ( org.apache.log4j.Level p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 return;
	 } // .end method
