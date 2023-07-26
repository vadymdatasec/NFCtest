public class e.b.a.z.t extends android.app.Fragment {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* # instance fields */
public final e.b.a.z.a b;
public final e.b.a.z.w c;
public final java.util.Set d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Le/b/a/z/t;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public e.b.a.u e;
public e.b.a.z.t f;
public android.app.Fragment g;
/* # direct methods */
public e.b.a.z.t ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/b/a/z/a; */
/* invoke-direct {v0}, Le/b/a/z/a;-><init>()V */
/* invoke-direct {p0, v0}, Le/b/a/z/t;-><init>(Le/b/a/z/a;)V */
return;
} // .end method
public e.b.a.z.t ( ) {
/* .locals 1 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "ValidFragment" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Landroid/app/Fragment;-><init>()V */
/* .line 3 */
/* new-instance v0, Le/b/a/z/s; */
/* invoke-direct {v0, p0}, Le/b/a/z/s;-><init>(Le/b/a/z/t;)V */
this.c = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.d = v0;
/* .line 5 */
this.b = p1;
return;
} // .end method
/* # virtual methods */
public java.util.Set a ( ) {
/* .locals 4 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x11 */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Le/b/a/z/t;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 3 */
v0 = this.f;
v0 = (( android.app.Fragment ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Fragment;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
v0 = this.d;
java.util.Collections .unmodifiableSet ( v0 );
/* .line 5 */
} // :cond_0
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_4
/* const/16 v1, 0x11 */
/* if-ge v0, v1, :cond_1 */
/* .line 6 */
} // :cond_1
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
/* .line 7 */
v1 = this.f;
(( e.b.a.z.t ) v1 ).a ( ); // invoke-virtual {v1}, Le/b/a/z/t;->a()Ljava/util/Set;
} // :cond_2
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Le/b/a/z/t; */
/* .line 8 */
(( android.app.Fragment ) v2 ).getParentFragment ( ); // invoke-virtual {v2}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;
v3 = (( e.b.a.z.t ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Le/b/a/z/t;->a(Landroid/app/Fragment;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 9 */
/* .line 10 */
} // :cond_3
java.util.Collections .unmodifiableSet ( v0 );
/* .line 11 */
} // :cond_4
} // :goto_1
java.util.Collections .emptySet ( );
} // .end method
public final void a ( android.app.Activity p0 ) {
/* .locals 1 */
/* .line 16 */
(( e.b.a.z.t ) p0 ).f ( ); // invoke-virtual {p0}, Le/b/a/z/t;->f()V
/* .line 17 */
e.b.a.d .a ( p1 );
(( e.b.a.d ) v0 ).h ( ); // invoke-virtual {v0}, Le/b/a/d;->h()Le/b/a/z/v;
(( e.b.a.z.v ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/z/v;->b(Landroid/app/Activity;)Le/b/a/z/t;
this.f = p1;
/* .line 18 */
p1 = (( android.app.Fragment ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Fragment;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_0 */
/* .line 19 */
p1 = this.f;
(( e.b.a.z.t ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Le/b/a/z/t;->a(Le/b/a/z/t;)V
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
this.e = p1;
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
return;
} // .end method
public final Boolean a ( android.app.Fragment p0 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x11 */
} // .end annotation
/* .line 12 */
(( android.app.Fragment ) p0 ).getParentFragment ( ); // invoke-virtual {p0}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;
/* .line 13 */
} // :goto_0
(( android.app.Fragment ) p1 ).getParentFragment ( ); // invoke-virtual {p1}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 14 */
v1 = (( android.app.Fragment ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/Fragment;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int p1 = 1; // const/4 p1, 0x1
/* .line 15 */
} // :cond_0
(( android.app.Fragment ) p1 ).getParentFragment ( ); // invoke-virtual {p1}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public e.b.a.z.a b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public void b ( android.app.Fragment p0 ) {
/* .locals 1 */
/* .line 3 */
this.g = p1;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
(( android.app.Fragment ) p1 ).getActivity ( ); // invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
(( android.app.Fragment ) p1 ).getActivity ( ); // invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;
(( e.b.a.z.t ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/t;->a(Landroid/app/Activity;)V
} // :cond_0
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
return;
} // .end method
public final android.app.Fragment c ( ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x11 */
} // .end annotation
/* .line 1 */
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.app.Fragment ) p0 ).getParentFragment ( ); // invoke-virtual {p0}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
} // :cond_1
v0 = this.g;
} // :goto_1
} // .end method
public e.b.a.u d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public e.b.a.z.w e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public final void f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.b.a.z.t ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/b/a/z/t;->b(Le/b/a/z/t;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.f = v0;
} // :cond_0
return;
} // .end method
public void onAttach ( android.app.Activity p0 ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V */
/* .line 2 */
try { // :try_start_0
(( e.b.a.z.t ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/t;->a(Landroid/app/Activity;)V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
int v0 = 5; // const/4 v0, 0x5
final String v1 = "RMFragment"; // const-string v1, "RMFragment"
/* .line 3 */
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "Unable to register fragment with root"; // const-string v0, "Unable to register fragment with root"
/* .line 4 */
android.util.Log .w ( v1,v0,p1 );
} // :cond_0
} // :goto_0
return;
} // .end method
public void onDestroy ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V */
/* .line 2 */
v0 = this.b;
(( e.b.a.z.a ) v0 ).a ( ); // invoke-virtual {v0}, Le/b/a/z/a;->a()V
/* .line 3 */
(( e.b.a.z.t ) p0 ).f ( ); // invoke-virtual {p0}, Le/b/a/z/t;->f()V
return;
} // .end method
public void onDetach ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Fragment;->onDetach()V */
/* .line 2 */
(( e.b.a.z.t ) p0 ).f ( ); // invoke-virtual {p0}, Le/b/a/z/t;->f()V
return;
} // .end method
public void onStart ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Fragment;->onStart()V */
/* .line 2 */
v0 = this.b;
(( e.b.a.z.a ) v0 ).b ( ); // invoke-virtual {v0}, Le/b/a/z/a;->b()V
return;
} // .end method
public void onStop ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Fragment;->onStop()V */
/* .line 2 */
v0 = this.b;
(( e.b.a.z.a ) v0 ).c ( ); // invoke-virtual {v0}, Le/b/a/z/a;->c()V
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-super {p0}, Landroid/app/Fragment;->toString()Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "{parent="; // const-string v1, "{parent="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.b.a.z.t ) p0 ).c ( ); // invoke-virtual {p0}, Le/b/a/z/t;->c()Landroid/app/Fragment;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
