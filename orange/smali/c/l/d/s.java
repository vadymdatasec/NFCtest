public class c.l.d.s extends androidx.fragment.app.Fragment implements android.content.DialogInterface$OnCancelListener implements android.content.DialogInterface$OnDismissListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public android.os.Handler Z;
	 public java.lang.Runnable a0;
	 public android.content.DialogInterface$OnCancelListener b0;
	 public android.content.DialogInterface$OnDismissListener c0;
	 public Integer d0;
	 public Integer e0;
	 public Boolean f0;
	 public Boolean g0;
	 public Integer h0;
	 public Boolean i0;
	 public c.n.q j0;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/n/q<", */
	 /* "Lc/n/j;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public android.app.Dialog k0;
public Boolean l0;
public Boolean m0;
public Boolean n0;
public Boolean o0;
/* # direct methods */
public c.l.d.s ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/l/d/s$a; */
/* invoke-direct {v0, p0}, Lc/l/d/s$a;-><init>(Lc/l/d/s;)V */
this.a0 = v0;
/* .line 3 */
/* new-instance v0, Lc/l/d/s$b; */
/* invoke-direct {v0, p0}, Lc/l/d/s$b;-><init>(Lc/l/d/s;)V */
this.b0 = v0;
/* .line 4 */
/* new-instance v0, Lc/l/d/s$c; */
/* invoke-direct {v0, p0}, Lc/l/d/s$c;-><init>(Lc/l/d/s;)V */
this.c0 = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
/* iput v0, p0, Lc/l/d/s;->d0:I */
/* .line 6 */
/* iput v0, p0, Lc/l/d/s;->e0:I */
int v1 = 1; // const/4 v1, 0x1
/* .line 7 */
/* iput-boolean v1, p0, Lc/l/d/s;->f0:Z */
/* .line 8 */
/* iput-boolean v1, p0, Lc/l/d/s;->g0:Z */
int v1 = -1; // const/4 v1, -0x1
/* .line 9 */
/* iput v1, p0, Lc/l/d/s;->h0:I */
/* .line 10 */
/* new-instance v1, Lc/l/d/s$d; */
/* invoke-direct {v1, p0}, Lc/l/d/s$d;-><init>(Lc/l/d/s;)V */
this.j0 = v1;
/* .line 11 */
/* iput-boolean v0, p0, Lc/l/d/s;->o0:Z */
return;
} // .end method
public static android.app.Dialog a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.k0;
} // .end method
public static android.content.DialogInterface$OnDismissListener b ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.c0;
} // .end method
public static Boolean c ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* iget-boolean p0, p0, Lc/l/d/s;->g0:Z */
} // .end method
/* # virtual methods */
public Boolean A0 ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/l/d/s;->o0:Z */
} // .end method
public c.l.d.n0 a ( ) {
/* .locals 2 */
/* .line 28 */
/* invoke-super {p0}, Landroidx/fragment/app/Fragment;->a()Lc/l/d/n0; */
/* .line 29 */
/* new-instance v1, Lc/l/d/s$e; */
/* invoke-direct {v1, p0, v0}, Lc/l/d/s$e;-><init>(Lc/l/d/s;Lc/l/d/n0;)V */
} // .end method
public void a ( android.app.Dialog p0, Integer p1 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* if-eq p2, v0, :cond_1 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq p2, v1, :cond_1 */
int v1 = 3; // const/4 v1, 0x3
/* if-eq p2, v1, :cond_0 */
/* .line 30 */
} // :cond_0
(( android.app.Dialog ) p1 ).getWindow ( ); // invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
if ( p2 != null) { // if-eqz p2, :cond_1
/* const/16 v1, 0x18 */
/* .line 31 */
(( android.view.Window ) p2 ).addFlags ( v1 ); // invoke-virtual {p2, v1}, Landroid/view/Window;->addFlags(I)V
/* .line 32 */
} // :cond_1
(( android.app.Dialog ) p1 ).requestWindowFeature ( v0 ); // invoke-virtual {p1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z
} // :goto_0
return;
} // .end method
public void a ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 24 */
/* invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->a(Landroid/content/Context;)V */
/* .line 25 */
(( androidx.fragment.app.Fragment ) p0 ).N ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Landroidx/lifecycle/LiveData;
v0 = this.j0;
(( androidx.lifecycle.LiveData ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/lifecycle/LiveData;->a(Lc/n/q;)V
/* .line 26 */
/* iget-boolean p1, p0, Lc/l/d/s;->n0:Z */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 27 */
/* iput-boolean p1, p0, Lc/l/d/s;->m0:Z */
} // :cond_0
return;
} // .end method
public void a ( c.l.d.o1 p0, java.lang.String p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput-boolean v0, p0, Lc/l/d/s;->m0:Z */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Lc/l/d/s;->n0:Z */
/* .line 4 */
(( c.l.d.o1 ) p1 ).b ( ); // invoke-virtual {p1}, Lc/l/d/o1;->b()Lc/l/d/e2;
/* .line 5 */
(( c.l.d.e2 ) p1 ).a ( p0, p2 ); // invoke-virtual {p1, p0, p2}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lc/l/d/e2;
/* .line 6 */
(( c.l.d.e2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/l/d/e2;->a()I
return;
} // .end method
public final void a ( Boolean p0, Boolean p1 ) {
/* .locals 3 */
/* .line 7 */
/* iget-boolean v0, p0, Lc/l/d/s;->m0:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 8 */
/* iput-boolean v0, p0, Lc/l/d/s;->m0:Z */
int v1 = 0; // const/4 v1, 0x0
/* .line 9 */
/* iput-boolean v1, p0, Lc/l/d/s;->n0:Z */
/* .line 10 */
v1 = this.k0;
if ( v1 != null) { // if-eqz v1, :cond_2
int v2 = 0; // const/4 v2, 0x0
/* .line 11 */
(( android.app.Dialog ) v1 ).setOnDismissListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
/* .line 12 */
v1 = this.k0;
(( android.app.Dialog ) v1 ).dismiss ( ); // invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V
/* if-nez p2, :cond_2 */
/* .line 13 */
android.os.Looper .myLooper ( );
v1 = this.Z;
(( android.os.Handler ) v1 ).getLooper ( ); // invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
/* if-ne p2, v1, :cond_1 */
/* .line 14 */
p2 = this.k0;
(( c.l.d.s ) p0 ).onDismiss ( p2 ); // invoke-virtual {p0, p2}, Lc/l/d/s;->onDismiss(Landroid/content/DialogInterface;)V
/* .line 15 */
} // :cond_1
p2 = this.Z;
v1 = this.a0;
(( android.os.Handler ) p2 ).post ( v1 ); // invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 16 */
} // :cond_2
} // :goto_0
/* iput-boolean v0, p0, Lc/l/d/s;->l0:Z */
/* .line 17 */
/* iget p2, p0, Lc/l/d/s;->h0:I */
/* if-ltz p2, :cond_3 */
/* .line 18 */
(( androidx.fragment.app.Fragment ) p0 ).z ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
/* iget p2, p0, Lc/l/d/s;->h0:I */
(( c.l.d.o1 ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lc/l/d/o1;->a(II)V
int p1 = -1; // const/4 p1, -0x1
/* .line 19 */
/* iput p1, p0, Lc/l/d/s;->h0:I */
/* .line 20 */
} // :cond_3
(( androidx.fragment.app.Fragment ) p0 ).z ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;
(( c.l.d.o1 ) p2 ).b ( ); // invoke-virtual {p2}, Lc/l/d/o1;->b()Lc/l/d/e2;
/* .line 21 */
(( c.l.d.e2 ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/e2;
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 22 */
(( c.l.d.e2 ) p2 ).b ( ); // invoke-virtual {p2}, Lc/l/d/e2;->b()I
/* .line 23 */
} // :cond_4
(( c.l.d.e2 ) p2 ).a ( ); // invoke-virtual {p2}, Lc/l/d/e2;->a()I
} // :goto_1
return;
} // .end method
public android.view.View b ( Integer p0 ) {
/* .locals 1 */
/* .line 7 */
v0 = this.k0;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
(( android.app.Dialog ) v0 ).findViewById ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void b ( android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2 ) {
/* .locals 0 */
/* .line 2 */
/* invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V */
/* .line 3 */
p1 = this.I;
/* if-nez p1, :cond_0 */
/* .line 4 */
p1 = this.k0;
if ( p1 != null) { // if-eqz p1, :cond_0
if ( p3 != null) { // if-eqz p3, :cond_0
final String p1 = "android:savedDialogState"; // const-string p1, "android:savedDialogState"
/* .line 5 */
(( android.os.Bundle ) p3 ).getBundle ( p1 ); // invoke-virtual {p3, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 6 */
p2 = this.k0;
(( android.app.Dialog ) p2 ).onRestoreInstanceState ( p1 ); // invoke-virtual {p2, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V
} // :cond_0
return;
} // .end method
public void c ( android.os.Bundle p0 ) {
/* .locals 3 */
/* .line 2 */
/* invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->c(Landroid/os/Bundle;)V */
/* .line 3 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.Z = v0;
/* .line 4 */
/* iget v0, p0, Landroidx/fragment/app/Fragment;->y:I */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iput-boolean v0, p0, Lc/l/d/s;->g0:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
final String v0 = "android:style"; // const-string v0, "android:style"
/* .line 5 */
v0 = (( android.os.Bundle ) p1 ).getInt ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
/* iput v0, p0, Lc/l/d/s;->d0:I */
final String v0 = "android:theme"; // const-string v0, "android:theme"
/* .line 6 */
v0 = (( android.os.Bundle ) p1 ).getInt ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
/* iput v0, p0, Lc/l/d/s;->e0:I */
final String v0 = "android:cancelable"; // const-string v0, "android:cancelable"
/* .line 7 */
v0 = (( android.os.Bundle ) p1 ).getBoolean ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
/* iput-boolean v0, p0, Lc/l/d/s;->f0:Z */
/* .line 8 */
/* iget-boolean v0, p0, Lc/l/d/s;->g0:Z */
final String v1 = "android:showsDialog"; // const-string v1, "android:showsDialog"
v0 = (( android.os.Bundle ) p1 ).getBoolean ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
/* iput-boolean v0, p0, Lc/l/d/s;->g0:Z */
int v0 = -1; // const/4 v0, -0x1
final String v1 = "android:backStackId"; // const-string v1, "android:backStackId"
/* .line 9 */
p1 = (( android.os.Bundle ) p1 ).getInt ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
/* iput p1, p0, Lc/l/d/s;->h0:I */
} // :cond_1
return;
} // .end method
public android.view.LayoutInflater d ( android.os.Bundle p0 ) {
/* .locals 4 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->d(Landroid/os/Bundle;)Landroid/view/LayoutInflater; */
/* .line 2 */
/* iget-boolean v1, p0, Lc/l/d/s;->g0:Z */
int v2 = 2; // const/4 v2, 0x2
final String v3 = "FragmentManager"; // const-string v3, "FragmentManager"
if ( v1 != null) { // if-eqz v1, :cond_3
/* iget-boolean v1, p0, Lc/l/d/s;->i0:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
} // :cond_0
(( c.l.d.s ) p0 ).o ( p1 ); // invoke-virtual {p0, p1}, Lc/l/d/s;->o(Landroid/os/Bundle;)V
/* .line 4 */
p1 = c.l.d.o1 .d ( v2 );
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 5 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "get layout inflater for DialogFragment "; // const-string v1, "get layout inflater for DialogFragment "
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " from dialog context"; // const-string v1, " from dialog context"
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v3,p1 );
/* .line 6 */
} // :cond_1
p1 = this.k0;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 7 */
(( android.app.Dialog ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;
(( android.view.LayoutInflater ) v0 ).cloneInContext ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;
} // :cond_2
/* .line 8 */
} // :cond_3
} // :goto_0
p1 = c.l.d.o1 .d ( v2 );
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 9 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "getting layout inflater for DialogFragment "; // const-string v1, "getting layout inflater for DialogFragment "
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 10 */
/* iget-boolean v1, p0, Lc/l/d/s;->g0:Z */
/* if-nez v1, :cond_4 */
/* .line 11 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "mShowsDialog = false: "; // const-string v2, "mShowsDialog = false: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v3,p1 );
/* .line 12 */
} // :cond_4
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "mCreatingDialog = true: "; // const-string v2, "mCreatingDialog = true: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v3,p1 );
} // :cond_5
} // :goto_1
} // .end method
public void d0 ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroidx/fragment/app/Fragment;->d0()V */
/* .line 2 */
v0 = this.k0;
if ( v0 != null) { // if-eqz v0, :cond_1
int v1 = 1; // const/4 v1, 0x1
/* .line 3 */
/* iput-boolean v1, p0, Lc/l/d/s;->l0:Z */
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
(( android.app.Dialog ) v0 ).setOnDismissListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
/* .line 5 */
v0 = this.k0;
(( android.app.Dialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
/* .line 6 */
/* iget-boolean v0, p0, Lc/l/d/s;->m0:Z */
/* if-nez v0, :cond_0 */
/* .line 7 */
v0 = this.k0;
(( c.l.d.s ) p0 ).onDismiss ( v0 ); // invoke-virtual {p0, v0}, Lc/l/d/s;->onDismiss(Landroid/content/DialogInterface;)V
/* .line 8 */
} // :cond_0
this.k0 = v1;
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
/* iput-boolean v0, p0, Lc/l/d/s;->o0:Z */
} // :cond_1
return;
} // .end method
public void e ( android.os.Bundle p0 ) {
/* .locals 3 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->e(Landroid/os/Bundle;)V */
/* .line 2 */
v0 = this.k0;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( android.app.Dialog ) v0 ).onSaveInstanceState ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;
int v1 = 0; // const/4 v1, 0x0
final String v2 = "android:dialogShowing"; // const-string v2, "android:dialogShowing"
/* .line 4 */
(( android.os.Bundle ) v0 ).putBoolean ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
final String v1 = "android:savedDialogState"; // const-string v1, "android:savedDialogState"
/* .line 5 */
(( android.os.Bundle ) p1 ).putBundle ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
/* .line 6 */
} // :cond_0
/* iget v0, p0, Lc/l/d/s;->d0:I */
if ( v0 != null) { // if-eqz v0, :cond_1
final String v1 = "android:style"; // const-string v1, "android:style"
/* .line 7 */
(( android.os.Bundle ) p1 ).putInt ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 8 */
} // :cond_1
/* iget v0, p0, Lc/l/d/s;->e0:I */
if ( v0 != null) { // if-eqz v0, :cond_2
final String v1 = "android:theme"; // const-string v1, "android:theme"
/* .line 9 */
(( android.os.Bundle ) p1 ).putInt ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 10 */
} // :cond_2
/* iget-boolean v0, p0, Lc/l/d/s;->f0:Z */
/* if-nez v0, :cond_3 */
final String v1 = "android:cancelable"; // const-string v1, "android:cancelable"
/* .line 11 */
(( android.os.Bundle ) p1 ).putBoolean ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 12 */
} // :cond_3
/* iget-boolean v0, p0, Lc/l/d/s;->g0:Z */
/* if-nez v0, :cond_4 */
final String v1 = "android:showsDialog"; // const-string v1, "android:showsDialog"
/* .line 13 */
(( android.os.Bundle ) p1 ).putBoolean ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 14 */
} // :cond_4
/* iget v0, p0, Lc/l/d/s;->h0:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_5 */
final String v1 = "android:backStackId"; // const-string v1, "android:backStackId"
/* .line 15 */
(( android.os.Bundle ) p1 ).putInt ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
} // :cond_5
return;
} // .end method
public void e0 ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroidx/fragment/app/Fragment;->e0()V */
/* .line 2 */
/* iget-boolean v0, p0, Lc/l/d/s;->n0:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lc/l/d/s;->m0:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Lc/l/d/s;->m0:Z */
/* .line 4 */
} // :cond_0
(( androidx.fragment.app.Fragment ) p0 ).N ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Landroidx/lifecycle/LiveData;
v1 = this.j0;
(( androidx.lifecycle.LiveData ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Landroidx/lifecycle/LiveData;->b(Lc/n/q;)V
return;
} // .end method
public void f ( android.os.Bundle p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->f(Landroid/os/Bundle;)V */
/* .line 2 */
v0 = this.k0;
if ( v0 != null) { // if-eqz v0, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
final String v0 = "android:savedDialogState"; // const-string v0, "android:savedDialogState"
/* .line 3 */
(( android.os.Bundle ) p1 ).getBundle ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
v0 = this.k0;
(( android.app.Dialog ) v0 ).onRestoreInstanceState ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V
} // :cond_0
return;
} // .end method
public void h0 ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroidx/fragment/app/Fragment;->h0()V */
/* .line 2 */
v0 = this.k0;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
/* iput-boolean v1, p0, Lc/l/d/s;->l0:Z */
/* .line 4 */
(( android.app.Dialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->show()V
/* .line 5 */
v0 = this.k0;
(( android.app.Dialog ) v0 ).getWindow ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
/* .line 6 */
c.n.z .a ( v0,p0 );
/* .line 7 */
c.n.a0 .a ( v0,p0 );
/* .line 8 */
c.s.d .a ( v0,p0 );
} // :cond_0
return;
} // .end method
public void i0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroidx/fragment/app/Fragment;->i0()V */
/* .line 2 */
v0 = this.k0;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( android.app.Dialog ) v0 ).hide ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->hide()V
} // :cond_0
return;
} // .end method
public void l ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lc/l/d/s;->g0:Z */
return;
} // .end method
public android.app.Dialog n ( android.os.Bundle p0 ) {
/* .locals 2 */
int p1 = 3; // const/4 p1, 0x3
/* .line 1 */
p1 = c.l.d.o1 .d ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "onCreateDialog called for DialogFragment "; // const-string v0, "onCreateDialog called for DialogFragment "
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "FragmentManager"; // const-string v0, "FragmentManager"
android.util.Log .d ( v0,p1 );
/* .line 3 */
} // :cond_0
/* new-instance p1, Landroid/app/Dialog; */
(( androidx.fragment.app.Fragment ) p0 ).v0 ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->v0()Landroid/content/Context;
v1 = (( c.l.d.s ) p0 ).z0 ( ); // invoke-virtual {p0}, Lc/l/d/s;->z0()I
/* invoke-direct {p1, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V */
} // .end method
public final void o ( android.os.Bundle p0 ) {
/* .locals 3 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/l/d/s;->g0:Z */
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* iget-boolean v0, p0, Lc/l/d/s;->o0:Z */
/* if-nez v0, :cond_3 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* .line 3 */
try { // :try_start_0
/* iput-boolean v1, p0, Lc/l/d/s;->i0:Z */
/* .line 4 */
(( c.l.d.s ) p0 ).n ( p1 ); // invoke-virtual {p0, p1}, Lc/l/d/s;->n(Landroid/os/Bundle;)Landroid/app/Dialog;
this.k0 = p1;
/* .line 5 */
/* iget-boolean v2, p0, Lc/l/d/s;->g0:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 6 */
/* iget v2, p0, Lc/l/d/s;->d0:I */
(( c.l.d.s ) p0 ).a ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Lc/l/d/s;->a(Landroid/app/Dialog;I)V
/* .line 7 */
(( androidx.fragment.app.Fragment ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;
/* .line 8 */
/* instance-of v2, p1, Landroid/app/Activity; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 9 */
v2 = this.k0;
/* check-cast p1, Landroid/app/Activity; */
(( android.app.Dialog ) v2 ).setOwnerActivity ( p1 ); // invoke-virtual {v2, p1}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V
/* .line 10 */
} // :cond_1
p1 = this.k0;
/* iget-boolean v2, p0, Lc/l/d/s;->f0:Z */
(( android.app.Dialog ) p1 ).setCancelable ( v2 ); // invoke-virtual {p1, v2}, Landroid/app/Dialog;->setCancelable(Z)V
/* .line 11 */
p1 = this.k0;
v2 = this.b0;
(( android.app.Dialog ) p1 ).setOnCancelListener ( v2 ); // invoke-virtual {p1, v2}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
/* .line 12 */
p1 = this.k0;
v2 = this.c0;
(( android.app.Dialog ) p1 ).setOnDismissListener ( v2 ); // invoke-virtual {p1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
/* .line 13 */
/* iput-boolean v1, p0, Lc/l/d/s;->o0:Z */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
/* .line 14 */
this.k0 = p1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 15 */
} // :goto_0
/* iput-boolean v0, p0, Lc/l/d/s;->i0:Z */
/* :catchall_0 */
/* move-exception p1 */
/* iput-boolean v0, p0, Lc/l/d/s;->i0:Z */
/* .line 16 */
/* throw p1 */
} // :cond_3
} // :goto_1
return;
} // .end method
public void onCancel ( android.content.DialogInterface p0 ) {
/* .locals 0 */
return;
} // .end method
public void onDismiss ( android.content.DialogInterface p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean p1, p0, Lc/l/d/s;->l0:Z */
/* if-nez p1, :cond_1 */
int p1 = 3; // const/4 p1, 0x3
/* .line 2 */
p1 = c.l.d.o1 .d ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "onDismiss called for DialogFragment "; // const-string v0, "onDismiss called for DialogFragment "
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "FragmentManager"; // const-string v0, "FragmentManager"
android.util.Log .d ( v0,p1 );
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
/* .line 4 */
(( c.l.d.s ) p0 ).a ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Lc/l/d/s;->a(ZZ)V
} // :cond_1
return;
} // .end method
public Integer z0 ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/l/d/s;->e0:I */
} // .end method
