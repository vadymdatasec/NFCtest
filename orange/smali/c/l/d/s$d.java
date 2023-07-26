public class c.l.d.s$d implements c.n.q {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lc/l/d/s; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Lc/n/q<", */
/* "Lc/n/j;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
public final c.l.d.s a; //synthetic
/* # direct methods */
public c.l.d.s$d ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "SyntheticAccessor" */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 2 */
p1 = this.a;
p1 = c.l.d.s .c ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 3 */
p1 = this.a;
(( androidx.fragment.app.Fragment ) p1 ).w0 ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->w0()Landroid/view/View;
/* .line 4 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-nez v0, :cond_1 */
/* .line 5 */
v0 = this.a;
c.l.d.s .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
	 int v0 = 3; // const/4 v0, 0x3
	 /* .line 6 */
	 v0 = 	 c.l.d.o1 .d ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 7 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "DialogFragment "; // const-string v1, "DialogFragment "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = " setting the content view on "; // const-string v1, " setting the content view on "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.a;
		 /* .line 8 */
		 c.l.d.s .a ( v1 );
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v1 = "FragmentManager"; // const-string v1, "FragmentManager"
		 /* .line 9 */
		 android.util.Log .d ( v1,v0 );
		 /* .line 10 */
	 } // :cond_0
	 v0 = this.a;
	 c.l.d.s .a ( v0 );
	 (( android.app.Dialog ) v0 ).setContentView ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V
	 /* .line 11 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "DialogFragment can not be attached to a container view"; // const-string v0, "DialogFragment can not be attached to a container view"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_2
} // :goto_0
return;
} // .end method
public void a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "SyntheticAccessor" */
/* } */
} // .end annotation
/* .line 1 */
/* check-cast p1, Lc/n/j; */
(( c.l.d.s$d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/l/d/s$d;->a(Lc/n/j;)V
return;
} // .end method
