public class inal implements android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.h.n.v1.c a;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 1 */
		 /* if-ne p0, p1, :cond_0 */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 1 */
	 } // :cond_0
	 /* instance-of v0, p1, Lc/h/n/v1/d; */
	 /* if-nez v0, :cond_1 */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 2 */
} // :cond_1
/* check-cast p1, Lc/h/n/v1/d; */
/* .line 3 */
v0 = this.a;
p1 = this.a;
p1 = (( java.lang.Object ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
} // .end method
public void onTouchExplorationStateChanged ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
return;
} // .end method
