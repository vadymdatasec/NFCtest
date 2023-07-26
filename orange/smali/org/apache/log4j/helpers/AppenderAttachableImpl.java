public class org.apache.log4j.helpers.AppenderAttachableImpl implements org.apache.log4j.spi.AppenderAttachable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.util.Vector a;
	 /* # direct methods */
	 public org.apache.log4j.helpers.AppenderAttachableImpl ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void addAppender ( org.apache.log4j.Appender p0 ) {
		 /* .locals 2 */
		 /* if-nez p1, :cond_0 */
		 return;
		 /* .line 1 */
	 } // :cond_0
	 v0 = this.a;
	 /* if-nez v0, :cond_1 */
	 /* .line 2 */
	 /* new-instance v0, Ljava/util/Vector; */
	 int v1 = 1; // const/4 v1, 0x1
	 /* invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V */
	 this.a = v0;
	 /* .line 3 */
} // :cond_1
v0 = this.a;
v0 = (( java.util.Vector ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Vector;->contains(Ljava/lang/Object;)Z
/* if-nez v0, :cond_2 */
/* .line 4 */
v0 = this.a;
(( java.util.Vector ) v0 ).addElement ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
} // :cond_2
return;
} // .end method
public Integer appendLoopOnAppenders ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 3 */
v2 = this.a;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lorg/apache/log4j/Appender; */
/* .line 4 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
/* move v1, v0 */
} // :cond_1
} // .end method
public java.util.Enumeration getAllAppenders ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
(( java.util.Vector ) v0 ).elements ( ); // invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;
} // .end method
public org.apache.log4j.Appender getAppender ( java.lang.String p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
/* if-nez p1, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 3 */
v3 = this.a;
(( java.util.Vector ) v3 ).elementAt ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v3, Lorg/apache/log4j/Appender; */
/* .line 4 */
v4 = (( java.lang.String ) p1 ).equals ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
} // :goto_1
} // .end method
public Boolean isAttached ( org.apache.log4j.Appender p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
/* if-nez p1, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 3 */
v3 = this.a;
(( java.util.Vector ) v3 ).elementAt ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v3, Lorg/apache/log4j/Appender; */
/* if-ne v3, p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
} // :goto_1
} // .end method
public void removeAllAppenders ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 3 */
v2 = this.a;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lorg/apache/log4j/Appender; */
/* .line 4 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 5 */
} // :cond_0
v0 = this.a;
(( java.util.Vector ) v0 ).removeAllElements ( ); // invoke-virtual {v0}, Ljava/util/Vector;->removeAllElements()V
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
this.a = v0;
} // :cond_1
return;
} // .end method
public void removeAppender ( java.lang.String p0 ) {
/* .locals 3 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 3 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* .line 4 */
} // :cond_0
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* .line 5 */
v2 = this.a;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lorg/apache/log4j/Appender; */
v2 = (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 6 */
p1 = this.a;
(( java.util.Vector ) p1 ).removeElementAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/util/Vector;->removeElementAt(I)V
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
} // :goto_1
return;
} // .end method
public void removeAppender ( org.apache.log4j.Appender p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
(( java.util.Vector ) v0 ).removeElement ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Vector;->removeElement(Ljava/lang/Object;)Z
} // :cond_1
} // :goto_0
return;
} // .end method
