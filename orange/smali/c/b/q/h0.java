public class c.b.q.h0 implements c.b.q.p0 implements android.content.DialogInterface$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.b.k.q b;
	 public android.widget.ListAdapter c;
	 public java.lang.CharSequence d;
	 public final c.b.q.q0 e; //synthetic
	 /* # direct methods */
	 public c.b.q.h0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.e = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Integer p0 ) {
		 /* .locals 1 */
		 final String p1 = "AppCompatSpinner"; // const-string p1, "AppCompatSpinner"
		 final String v0 = "Cannot set horizontal offset for MODE_DIALOG, ignoring"; // const-string v0, "Cannot set horizontal offset for MODE_DIALOG, ignoring"
		 /* .line 17 */
		 android.util.Log .e ( p1,v0 );
		 return;
	 } // .end method
	 public void a ( Integer p0, Integer p1 ) {
		 /* .locals 3 */
		 /* .line 3 */
		 v0 = this.c;
		 /* if-nez v0, :cond_0 */
		 return;
		 /* .line 4 */
	 } // :cond_0
	 /* new-instance v0, Lc/b/k/p; */
	 v1 = this.e;
	 (( c.b.q.q0 ) v1 ).getPopupContext ( ); // invoke-virtual {v1}, Lc/b/q/q0;->getPopupContext()Landroid/content/Context;
	 /* invoke-direct {v0, v1}, Lc/b/k/p;-><init>(Landroid/content/Context;)V */
	 /* .line 5 */
	 v1 = this.d;
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 6 */
		 (( c.b.k.p ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/k/p;->a(Ljava/lang/CharSequence;)Lc/b/k/p;
		 /* .line 7 */
	 } // :cond_1
	 v1 = this.c;
	 v2 = this.e;
	 /* .line 8 */
	 v2 = 	 (( android.widget.Spinner ) v2 ).getSelectedItemPosition ( ); // invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItemPosition()I
	 /* .line 9 */
	 (( c.b.k.p ) v0 ).a ( v1, v2, p0 ); // invoke-virtual {v0, v1, v2, p0}, Lc/b/k/p;->a(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Lc/b/k/p;
	 /* .line 10 */
	 (( c.b.k.p ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/k/p;->a()Lc/b/k/q;
	 this.b = v0;
	 /* .line 11 */
	 (( c.b.k.q ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/k/q;->b()Landroid/widget/ListView;
	 /* .line 12 */
	 /* const/16 v2, 0x11 */
	 /* if-lt v1, v2, :cond_2 */
	 /* .line 13 */
	 (( android.widget.ListView ) v0 ).setTextDirection ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ListView;->setTextDirection(I)V
	 /* .line 14 */
	 (( android.widget.ListView ) v0 ).setTextAlignment ( p2 ); // invoke-virtual {v0, p2}, Landroid/widget/ListView;->setTextAlignment(I)V
	 /* .line 15 */
} // :cond_2
p1 = this.b;
(( android.app.Dialog ) p1 ).show ( ); // invoke-virtual {p1}, Landroid/app/Dialog;->show()V
return;
} // .end method
public void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
final String p1 = "AppCompatSpinner"; // const-string p1, "AppCompatSpinner"
final String v0 = "Cannot set popup background for MODE_DIALOG, ignoring"; // const-string v0, "Cannot set popup background for MODE_DIALOG, ignoring"
/* .line 16 */
android.util.Log .e ( p1,v0 );
return;
} // .end method
public void a ( android.widget.ListAdapter p0 ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
return;
} // .end method
public void a ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 2 */
this.d = p1;
return;
} // .end method
public void b ( Integer p0 ) {
/* .locals 1 */
final String p1 = "AppCompatSpinner"; // const-string p1, "AppCompatSpinner"
final String v0 = "Cannot set vertical offset for MODE_DIALOG, ignoring"; // const-string v0, "Cannot set vertical offset for MODE_DIALOG, ignoring"
/* .line 2 */
android.util.Log .e ( p1,v0 );
return;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = 	 (( android.app.Dialog ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer c ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void c ( Integer p0 ) {
/* .locals 1 */
final String p1 = "AppCompatSpinner"; // const-string p1, "AppCompatSpinner"
final String v0 = "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"; // const-string v0, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"
/* .line 1 */
android.util.Log .e ( p1,v0 );
return;
} // .end method
public Integer d ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void dismiss ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.app.Dialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.b = v0;
} // :cond_0
return;
} // .end method
public android.graphics.drawable.Drawable e ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.CharSequence f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
p1 = this.e;
(( android.widget.Spinner ) p1 ).setSelection ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setSelection(I)V
/* .line 2 */
p1 = this.e;
(( android.widget.Spinner ) p1 ).getOnItemClickListener ( ); // invoke-virtual {p1}, Landroid/widget/Spinner;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
p1 = this.e;
int v0 = 0; // const/4 v0, 0x0
v1 = this.c;
/* move-result-wide v1 */
(( android.widget.Spinner ) p1 ).performItemClick ( v0, p2, v1, v2 ); // invoke-virtual {p1, v0, p2, v1, v2}, Landroid/widget/Spinner;->performItemClick(Landroid/view/View;IJ)Z
/* .line 4 */
} // :cond_0
(( c.b.q.h0 ) p0 ).dismiss ( ); // invoke-virtual {p0}, Lc/b/q/h0;->dismiss()V
return;
} // .end method
