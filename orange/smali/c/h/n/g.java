public abstract class c.h.n.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.h.n.f a;
	 /* # direct methods */
	 public c.h.n.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.View a ( android.view.MenuItem p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( c.h.n.g ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/n/g;->c()Landroid/view/View;
	 } // .end method
	 public abstract void a ( android.view.SubMenu p0 ) {
	 } // .end method
	 public void a ( Object p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void a ( Object p0 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 /* .line 3 */
				 /* new-instance v0, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v1 = "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set.Are you reusing this "; // const-string v1, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set.Are you reusing this "
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* .line 4 */
				 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
				 (( java.lang.Class ) v1 ).getSimpleName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 final String v1 = " instance while it is still in use somewhere else?"; // const-string v1, " instance while it is still in use somewhere else?"
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 final String v1 = "ActionProvider(support)"; // const-string v1, "ActionProvider(support)"
				 /* .line 5 */
				 android.util.Log .w ( v1,v0 );
				 /* .line 6 */
			 } // :cond_0
			 this.a = p1;
			 return;
		 } // .end method
		 public abstract Boolean a ( ) {
		 } // .end method
		 public Boolean b ( ) {
			 /* .locals 1 */
			 int v0 = 1; // const/4 v0, 0x1
		 } // .end method
		 public abstract android.view.View c ( ) {
		 } // .end method
		 public abstract Boolean d ( ) {
		 } // .end method
		 public Boolean e ( ) {
			 /* .locals 1 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // .end method
		 public void f ( ) {
			 /* .locals 1 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 1 */
			 this.a = v0;
			 return;
		 } // .end method
