public class e.b.a.z.l0 extends androidx.fragment.app.Fragment {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Le/b/a/z/l0$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.b.a.z.a Z;
public final java.util.Set a0;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Le/b/a/z/l0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public e.b.a.z.l0 b0;
public e.b.a.u c0;
public androidx.fragment.app.Fragment d0;
/* # direct methods */
public e.b.a.z.l0 ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/b/a/z/a; */
/* invoke-direct {v0}, Le/b/a/z/a;-><init>()V */
/* invoke-direct {p0, v0}, Le/b/a/z/l0;-><init>(Le/b/a/z/a;)V */
return;
} // .end method
public e.b.a.z.l0 ( ) {
/* .locals 1 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "ValidFragment" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V */
/* .line 3 */
/* new-instance v0, Le/b/a/z/l0$a; */
/* invoke-direct {v0, p0}, Le/b/a/z/l0$a;-><init>(Le/b/a/z/l0;)V */
/* .line 4 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.a0 = v0;
/* .line 5 */
this.Z = p1;
return;
} // .end method
public static c.l.d.o1 d ( androidx.fragment.app.Fragment p0 ) {
/* .locals 1 */
/* .line 1 */
} // :goto_0
(( androidx.fragment.app.Fragment ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.fragment.app.Fragment ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment;
/* .line 3 */
} // :cond_0
(( androidx.fragment.app.Fragment ) p0 ).u ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Lc/l/d/o1;
} // .end method
/* # virtual methods */
public e.b.a.z.a A0 ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.Z;
} // .end method
public final androidx.fragment.app.Fragment B0 ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.fragment.app.Fragment ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = this.d0;
} // :goto_0
} // .end method
public e.b.a.u C0 ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c0;
} // .end method
public final void D0 ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b0;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.b.a.z.l0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/b/a/z/l0;->b(Le/b/a/z/l0;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.b0 = v0;
} // :cond_0
return;
} // .end method
public void a ( android.content.Context p0 ) {
/* .locals 3 */
/* .line 8 */
/* invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->a(Landroid/content/Context;)V */
/* .line 9 */
e.b.a.z.l0 .d ( p0 );
int v0 = 5; // const/4 v0, 0x5
final String v1 = "SupportRMFragment"; // const-string v1, "SupportRMFragment"
/* if-nez p1, :cond_1 */
/* .line 10 */
p1 = android.util.Log .isLoggable ( v1,v0 );
if ( p1 != null) { // if-eqz p1, :cond_0
final String p1 = "Unable to register fragment with root, ancestor detached"; // const-string p1, "Unable to register fragment with root, ancestor detached"
/* .line 11 */
android.util.Log .w ( v1,p1 );
} // :cond_0
return;
/* .line 12 */
} // :cond_1
try { // :try_start_0
(( androidx.fragment.app.Fragment ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;
(( e.b.a.z.l0 ) p0 ).a ( v2, p1 ); // invoke-virtual {p0, v2, p1}, Le/b/a/z/l0;->a(Landroid/content/Context;Lc/l/d/o1;)V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 13 */
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
final String v0 = "Unable to register fragment with root"; // const-string v0, "Unable to register fragment with root"
/* .line 14 */
android.util.Log .w ( v1,v0,p1 );
} // :cond_2
} // :goto_0
return;
} // .end method
public final void a ( android.content.Context p0, c.l.d.o1 p1 ) {
/* .locals 0 */
/* .line 2 */
(( e.b.a.z.l0 ) p0 ).D0 ( ); // invoke-virtual {p0}, Le/b/a/z/l0;->D0()V
/* .line 3 */
e.b.a.d .a ( p1 );
/* .line 4 */
(( e.b.a.d ) p1 ).h ( ); // invoke-virtual {p1}, Le/b/a/d;->h()Le/b/a/z/v;
/* .line 5 */
(( e.b.a.z.v ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/b/a/z/v;->a(Lc/l/d/o1;)Le/b/a/z/l0;
this.b0 = p1;
/* .line 6 */
p1 = (( androidx.fragment.app.Fragment ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_0 */
/* .line 7 */
p1 = this.b0;
(( e.b.a.z.l0 ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Le/b/a/z/l0;->a(Le/b/a/z/l0;)V
} // :cond_0
return;
} // .end method
public final void a ( e.b.a.z.l0 p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a0;
return;
} // .end method
public final void b ( e.b.a.z.l0 p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a0;
return;
} // .end method
public final Boolean b ( androidx.fragment.app.Fragment p0 ) {
/* .locals 2 */
/* .line 2 */
(( e.b.a.z.l0 ) p0 ).B0 ( ); // invoke-virtual {p0}, Le/b/a/z/l0;->B0()Landroidx/fragment/app/Fragment;
/* .line 3 */
} // :goto_0
(( androidx.fragment.app.Fragment ) p1 ).y ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
v1 = (( androidx.fragment.app.Fragment ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int p1 = 1; // const/4 p1, 0x1
/* .line 5 */
} // :cond_0
(( androidx.fragment.app.Fragment ) p1 ).y ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment;
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void b0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroidx/fragment/app/Fragment;->b0()V */
/* .line 2 */
v0 = this.Z;
(( e.b.a.z.a ) v0 ).a ( ); // invoke-virtual {v0}, Le/b/a/z/a;->a()V
/* .line 3 */
(( e.b.a.z.l0 ) p0 ).D0 ( ); // invoke-virtual {p0}, Le/b/a/z/l0;->D0()V
return;
} // .end method
public void c ( androidx.fragment.app.Fragment p0 ) {
/* .locals 1 */
/* .line 1 */
this.d0 = p1;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 2 */
(( androidx.fragment.app.Fragment ) p1 ).m ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;
/* if-nez v0, :cond_0 */
/* .line 3 */
} // :cond_0
e.b.a.z.l0 .d ( p1 );
/* if-nez v0, :cond_1 */
return;
/* .line 4 */
} // :cond_1
(( androidx.fragment.app.Fragment ) p1 ).m ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;
(( e.b.a.z.l0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/b/a/z/l0;->a(Landroid/content/Context;Lc/l/d/o1;)V
} // :cond_2
} // :goto_0
return;
} // .end method
public void e0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroidx/fragment/app/Fragment;->e0()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.d0 = v0;
/* .line 3 */
(( e.b.a.z.l0 ) p0 ).D0 ( ); // invoke-virtual {p0}, Le/b/a/z/l0;->D0()V
return;
} // .end method
public void h0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroidx/fragment/app/Fragment;->h0()V */
/* .line 2 */
v0 = this.Z;
(( e.b.a.z.a ) v0 ).b ( ); // invoke-virtual {v0}, Le/b/a/z/a;->b()V
return;
} // .end method
public void i0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroidx/fragment/app/Fragment;->i0()V */
/* .line 2 */
v0 = this.Z;
(( e.b.a.z.a ) v0 ).c ( ); // invoke-virtual {v0}, Le/b/a/z/a;->c()V
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-super {p0}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "{parent="; // const-string v1, "{parent="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.b.a.z.l0 ) p0 ).B0 ( ); // invoke-virtual {p0}, Le/b/a/z/l0;->B0()Landroidx/fragment/app/Fragment;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public java.util.Set z0 ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Le/b/a/z/l0;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b0;
/* if-nez v0, :cond_0 */
/* .line 2 */
java.util.Collections .emptySet ( );
/* .line 3 */
} // :cond_0
v0 = (( androidx.fragment.app.Fragment ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
v0 = this.a0;
java.util.Collections .unmodifiableSet ( v0 );
/* .line 5 */
} // :cond_1
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
/* .line 6 */
v1 = this.b0;
(( e.b.a.z.l0 ) v1 ).z0 ( ); // invoke-virtual {v1}, Le/b/a/z/l0;->z0()Ljava/util/Set;
} // :cond_2
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Le/b/a/z/l0; */
/* .line 7 */
(( e.b.a.z.l0 ) v2 ).B0 ( ); // invoke-virtual {v2}, Le/b/a/z/l0;->B0()Landroidx/fragment/app/Fragment;
v3 = (( e.b.a.z.l0 ) p0 ).b ( v3 ); // invoke-virtual {p0, v3}, Le/b/a/z/l0;->b(Landroidx/fragment/app/Fragment;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 8 */
/* .line 9 */
} // :cond_3
java.util.Collections .unmodifiableSet ( v0 );
} // .end method
