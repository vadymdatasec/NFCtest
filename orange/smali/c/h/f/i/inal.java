public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.res.Resources a;
	 public final android.content.res.Resources$Theme b;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 4 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-ne p0, p1, :cond_0 */
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
	 if ( p1 != null) { // if-eqz p1, :cond_3
		 /* .line 1 */
		 /* const-class v2, Lc/h/f/i/o; */
		 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 /* if-eq v2, v3, :cond_1 */
		 /* .line 2 */
	 } // :cond_1
	 /* check-cast p1, Lc/h/f/i/o; */
	 /* .line 3 */
	 v2 = this.a;
	 v3 = this.a;
	 v2 = 	 (( java.lang.Object ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_2
		 v2 = this.b;
		 p1 = this.b;
		 /* .line 4 */
		 p1 = 		 c.h.m.c .a ( v2,p1 );
		 if ( p1 != null) { // if-eqz p1, :cond_2
		 } // :cond_2
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_3
} // :goto_1
} // .end method
public Integer hashCode ( ) {
/* .locals 3 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 1 */
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
v1 = this.b;
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
v0 = c.h.m.c .a ( v0 );
} // .end method
