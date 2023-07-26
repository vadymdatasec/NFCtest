public class c.h.o.o implements android.view.ActionMode$Callback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.ActionMode$Callback a;
	 public final android.widget.TextView b;
	 public java.lang.Class c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public java.lang.reflect.Method d;
public Boolean e;
public Boolean f;
/* # direct methods */
public c.h.o.o ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
this.b = p2;
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
/* iput-boolean p1, p0, Lc/h/o/o;->f:Z */
return;
} // .end method
/* # virtual methods */
public final android.content.Intent a ( ) {
/* .locals 2 */
/* .line 44 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
final String v1 = "android.intent.action.PROCESS_TEXT"; // const-string v1, "android.intent.action.PROCESS_TEXT"
(( android.content.Intent ) v0 ).setAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
final String v1 = "text/plain"; // const-string v1, "text/plain"
(( android.content.Intent ) v0 ).setType ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
} // .end method
public final android.content.Intent a ( android.content.pm.ResolveInfo p0, android.widget.TextView p1 ) {
/* .locals 2 */
/* .line 38 */
(( c.h.o.o ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/o/o;->a()Landroid/content/Intent;
/* .line 39 */
p2 = (( c.h.o.o ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/h/o/o;->a(Landroid/widget/TextView;)Z
/* xor-int/lit8 p2, p2, 0x1 */
final String v1 = "android.intent.extra.PROCESS_TEXT_READONLY"; // const-string v1, "android.intent.extra.PROCESS_TEXT_READONLY"
(( android.content.Intent ) v0 ).putExtra ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
p1 = this.activityInfo;
v0 = this.packageName;
p1 = this.name;
/* .line 40 */
(( android.content.Intent ) p2 ).setClassName ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
} // .end method
public final java.util.List a ( android.content.Context p0, android.content.pm.PackageManager p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Landroid/content/pm/PackageManager;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Landroid/content/pm/ResolveInfo;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 28 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 29 */
/* instance-of v1, p1, Landroid/app/Activity; */
/* if-nez v1, :cond_0 */
/* .line 30 */
} // :cond_0
(( c.h.o.o ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/o/o;->a()Landroid/content/Intent;
int v2 = 0; // const/4 v2, 0x0
(( android.content.pm.PackageManager ) p2 ).queryIntentActivities ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
/* .line 31 */
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Landroid/content/pm/ResolveInfo; */
/* .line 32 */
v2 = (( c.h.o.o ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lc/h/o/o;->a(Landroid/content/pm/ResolveInfo;Landroid/content/Context;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 33 */
} // :cond_2
} // .end method
public final void a ( android.view.Menu p0 ) {
/* .locals 8 */
/* .line 1 */
v0 = this.b;
(( android.widget.TextView ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
/* .line 2 */
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 3 */
/* iget-boolean v2, p0, Lc/h/o/o;->f:Z */
final String v3 = "removeItemAt"; // const-string v3, "removeItemAt"
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
/* if-nez v2, :cond_0 */
/* .line 4 */
/* iput-boolean v5, p0, Lc/h/o/o;->f:Z */
try { // :try_start_0
final String v2 = "com.android.internal.view.menu.MenuBuilder"; // const-string v2, "com.android.internal.view.menu.MenuBuilder"
/* .line 5 */
java.lang.Class .forName ( v2 );
this.c = v2;
/* new-array v6, v5, [Ljava/lang/Class; */
/* .line 6 */
v7 = java.lang.Integer.TYPE;
/* aput-object v7, v6, v4 */
/* .line 7 */
(( java.lang.Class ) v2 ).getDeclaredMethod ( v3, v6 ); // invoke-virtual {v2, v3, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
this.d = v2;
/* .line 8 */
/* iput-boolean v5, p0, Lc/h/o/o;->e:Z */
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int v2 = 0; // const/4 v2, 0x0
/* .line 9 */
this.c = v2;
/* .line 10 */
this.d = v2;
/* .line 11 */
/* iput-boolean v4, p0, Lc/h/o/o;->e:Z */
/* .line 12 */
} // :cond_0
} // :goto_0
try { // :try_start_1
/* iget-boolean v2, p0, Lc/h/o/o;->e:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = this.c;
v2 = (( java.lang.Class ) v2 ).isInstance ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 13 */
v2 = this.d;
/* .line 14 */
} // :cond_1
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* new-array v6, v5, [Ljava/lang/Class; */
v7 = java.lang.Integer.TYPE;
/* aput-object v7, v6, v4 */
/* .line 15 */
(( java.lang.Class ) v2 ).getDeclaredMethod ( v3, v6 ); // invoke-virtual {v2, v3, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 16 */
v3 = } // :goto_1
/* sub-int/2addr v3, v5 */
} // :goto_2
/* if-ltz v3, :cond_3 */
/* .line 17 */
/* .line 18 */
if ( v7 != null) { // if-eqz v7, :cond_2
final String v7 = "android.intent.action.PROCESS_TEXT"; // const-string v7, "android.intent.action.PROCESS_TEXT"
/* .line 19 */
(( android.content.Intent ) v6 ).getAction ( ); // invoke-virtual {v6}, Landroid/content/Intent;->getAction()Ljava/lang/String;
v6 = (( java.lang.String ) v7 ).equals ( v6 ); // invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* new-array v6, v5, [Ljava/lang/Object; */
/* .line 20 */
java.lang.Integer .valueOf ( v3 );
/* aput-object v7, v6, v4 */
(( java.lang.reflect.Method ) v2 ).invoke ( p1, v6 ); // invoke-virtual {v2, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 ..:try_end_1} :catch_1 */
} // :cond_2
/* add-int/lit8 v3, v3, -0x1 */
/* .line 21 */
} // :cond_3
(( c.h.o.o ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/h/o/o;->a(Landroid/content/Context;Landroid/content/pm/PackageManager;)Ljava/util/List;
int v2 = 0; // const/4 v2, 0x0
/* .line 22 */
v3 = } // :goto_3
/* if-ge v2, v3, :cond_4 */
/* .line 23 */
/* check-cast v3, Landroid/content/pm/ResolveInfo; */
/* add-int/lit8 v6, v2, 0x64 */
/* .line 24 */
(( android.content.pm.ResolveInfo ) v3 ).loadLabel ( v1 ); // invoke-virtual {v3, v1}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
/* .line 25 */
v7 = this.b;
/* .line 26 */
(( c.h.o.o ) p0 ).a ( v3, v7 ); // invoke-virtual {p0, v3, v7}, Lc/h/o/o;->a(Landroid/content/pm/ResolveInfo;Landroid/widget/TextView;)Landroid/content/Intent;
/* .line 27 */
/* add-int/lit8 v2, v2, 0x1 */
/* :catch_1 */
} // :cond_4
return;
} // .end method
public final Boolean a ( android.content.pm.ResolveInfo p0, android.content.Context p1 ) {
/* .locals 3 */
/* .line 34 */
(( android.content.Context ) p2 ).getPackageName ( ); // invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
v1 = this.activityInfo;
v1 = this.packageName;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 35 */
} // :cond_0
p1 = this.activityInfo;
/* iget-boolean v0, p1, Landroid/content/pm/ActivityInfo;->exported:Z */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_1 */
/* .line 36 */
} // :cond_1
p1 = this.permission;
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 37 */
p1 = (( android.content.Context ) p2 ).checkSelfPermission ( p1 ); // invoke-virtual {p2, p1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I
/* if-nez p1, :cond_2 */
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :cond_3
} // :goto_0
} // .end method
public final Boolean a ( android.widget.TextView p0 ) {
/* .locals 1 */
/* .line 41 */
/* instance-of v0, p1, Landroid/text/Editable; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 42 */
v0 = (( android.widget.TextView ) p1 ).onCheckIsTextEditor ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->onCheckIsTextEditor()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 43 */
p1 = (( android.widget.TextView ) p1 ).isEnabled ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->isEnabled()Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean onActionItemClicked ( android.view.ActionMode p0, android.view.MenuItem p1 ) {
/* .locals 1 */
/* .line 1 */
p1 = v0 = this.a;
} // .end method
public Boolean onCreateActionMode ( android.view.ActionMode p0, android.view.Menu p1 ) {
/* .locals 1 */
/* .line 1 */
p1 = v0 = this.a;
} // .end method
public void onDestroyActionMode ( android.view.ActionMode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
return;
} // .end method
public Boolean onPrepareActionMode ( android.view.ActionMode p0, android.view.Menu p1 ) {
/* .locals 1 */
/* .line 1 */
(( c.h.o.o ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/h/o/o;->a(Landroid/view/Menu;)V
/* .line 2 */
p1 = v0 = this.a;
} // .end method
