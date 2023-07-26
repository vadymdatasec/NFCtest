public class c.b.q.f2 extends c.i.a.f implements android.view.View$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "RestrictedAPI" */
	 /* } */
} // .end annotation
/* # instance fields */
public final androidx.appcompat.widget.SearchView m;
public final android.app.SearchableInfo n;
public final android.content.Context o;
public final java.util.WeakHashMap p;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/WeakHashMap<", */
/* "Ljava/lang/String;", */
/* "Landroid/graphics/drawable/Drawable$ConstantState;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final Integer q;
public Boolean r;
public Integer s;
public android.content.res.ColorStateList t;
public Integer u;
public Integer v;
public Integer w;
public Integer x;
public Integer y;
public Integer z;
/* # direct methods */
public c.b.q.f2 ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Landroidx/appcompat/widget/SearchView;", */
/* "Landroid/app/SearchableInfo;", */
/* "Ljava/util/WeakHashMap<", */
/* "Ljava/lang/String;", */
/* "Landroid/graphics/drawable/Drawable$ConstantState;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( androidx.appcompat.widget.SearchView ) p2 ).getSuggestionRowLayout ( ); // invoke-virtual {p2}, Landroidx/appcompat/widget/SearchView;->getSuggestionRowLayout()I
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {p0, p1, v0, v2, v1}, Lc/i/a/f;-><init>(Landroid/content/Context;ILandroid/database/Cursor;Z)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput-boolean v0, p0, Lc/b/q/f2;->r:Z */
/* .line 3 */
/* iput v1, p0, Lc/b/q/f2;->s:I */
int v0 = -1; // const/4 v0, -0x1
/* .line 4 */
/* iput v0, p0, Lc/b/q/f2;->u:I */
/* .line 5 */
/* iput v0, p0, Lc/b/q/f2;->v:I */
/* .line 6 */
/* iput v0, p0, Lc/b/q/f2;->w:I */
/* .line 7 */
/* iput v0, p0, Lc/b/q/f2;->x:I */
/* .line 8 */
/* iput v0, p0, Lc/b/q/f2;->y:I */
/* .line 9 */
/* iput v0, p0, Lc/b/q/f2;->z:I */
/* .line 10 */
v0 = this.e;
final String v1 = "search"; // const-string v1, "search"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/SearchManager; */
/* .line 11 */
this.m = p2;
/* .line 12 */
this.n = p3;
/* .line 13 */
p2 = (( androidx.appcompat.widget.SearchView ) p2 ).getSuggestionCommitIconResId ( ); // invoke-virtual {p2}, Landroidx/appcompat/widget/SearchView;->getSuggestionCommitIconResId()I
/* iput p2, p0, Lc/b/q/f2;->q:I */
/* .line 14 */
this.o = p1;
/* .line 15 */
this.p = p4;
return;
} // .end method
public static java.lang.String a ( android.database.Cursor p0, Integer p1 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
int v1 = -1; // const/4 v1, -0x1
/* if-ne p1, v1, :cond_0 */
/* .line 76 */
} // :cond_0
try { // :try_start_0
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
final String p1 = "SuggestionsAdapter"; // const-string p1, "SuggestionsAdapter"
final String v1 = "unexpected error retrieving valid column from cursor, did the remote process die?"; // const-string v1, "unexpected error retrieving valid column from cursor, did the remote process die?"
/* .line 77 */
android.util.Log .e ( p1,v1,p0 );
} // .end method
public static java.lang.String a ( android.database.Cursor p0, java.lang.String p1 ) {
/* .locals 0 */
p1 = /* .line 74 */
/* .line 75 */
c.b.q.f2 .a ( p0,p1 );
} // .end method
/* # virtual methods */
public android.database.Cursor a ( android.app.SearchableInfo p0, java.lang.String p1, Integer p2 ) {
/* .locals 9 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 78 */
} // :cond_0
(( android.app.SearchableInfo ) p1 ).getSuggestAuthority ( ); // invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;
/* if-nez v1, :cond_1 */
/* .line 79 */
} // :cond_1
/* new-instance v2, Landroid/net/Uri$Builder; */
/* invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V */
final String v3 = "content"; // const-string v3, "content"
/* .line 80 */
(( android.net.Uri$Builder ) v2 ).scheme ( v3 ); // invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;
/* .line 81 */
(( android.net.Uri$Builder ) v2 ).authority ( v1 ); // invoke-virtual {v2, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;
final String v2 = ""; // const-string v2, ""
/* .line 82 */
(( android.net.Uri$Builder ) v1 ).query ( v2 ); // invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->query(Ljava/lang/String;)Landroid/net/Uri$Builder;
/* .line 83 */
(( android.net.Uri$Builder ) v1 ).fragment ( v2 ); // invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;
/* .line 84 */
(( android.app.SearchableInfo ) p1 ).getSuggestPath ( ); // invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestPath()Ljava/lang/String;
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 85 */
(( android.net.Uri$Builder ) v1 ).appendEncodedPath ( v2 ); // invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
} // :cond_2
final String v2 = "search_suggest_query"; // const-string v2, "search_suggest_query"
/* .line 86 */
(( android.net.Uri$Builder ) v1 ).appendPath ( v2 ); // invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
/* .line 87 */
(( android.app.SearchableInfo ) p1 ).getSuggestSelection ( ); // invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestSelection()Ljava/lang/String;
if ( v6 != null) { // if-eqz v6, :cond_3
int p1 = 1; // const/4 p1, 0x1
/* new-array v0, p1, [Ljava/lang/String; */
int p1 = 0; // const/4 p1, 0x0
/* aput-object p2, v0, p1 */
/* .line 88 */
} // :cond_3
(( android.net.Uri$Builder ) v1 ).appendPath ( p2 ); // invoke-virtual {v1, p2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
} // :goto_0
/* move-object v7, v0 */
/* if-lez p3, :cond_4 */
/* .line 89 */
java.lang.String .valueOf ( p3 );
final String p2 = "limit"; // const-string p2, "limit"
(( android.net.Uri$Builder ) v1 ).appendQueryParameter ( p2, p1 ); // invoke-virtual {v1, p2, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
/* .line 90 */
} // :cond_4
(( android.net.Uri$Builder ) v1 ).build ( ); // invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
/* .line 91 */
p1 = this.e;
(( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
int v5 = 0; // const/4 v5, 0x0
int v8 = 0; // const/4 v8, 0x0
/* invoke-virtual/range {v3 ..v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
} // .end method
public android.database.Cursor a ( java.lang.CharSequence p0 ) {
/* .locals 3 */
/* if-nez p1, :cond_0 */
final String p1 = ""; // const-string p1, ""
/* .line 2 */
} // :cond_0
/* .line 3 */
} // :goto_0
v0 = this.m;
v0 = (( android.view.ViewGroup ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_2 */
v0 = this.m;
/* .line 4 */
v0 = (( android.view.ViewGroup ) v0 ).getWindowVisibility ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getWindowVisibility()I
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
} // :cond_1
try { // :try_start_0
v0 = this.n;
/* const/16 v2, 0x32 */
(( c.b.q.f2 ) p0 ).a ( v0, p1, v2 ); // invoke-virtual {p0, v0, p1, v2}, Lc/b/q/f2;->a(Landroid/app/SearchableInfo;Ljava/lang/String;I)Landroid/database/Cursor;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 6 */
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String v0 = "SuggestionsAdapter"; // const-string v0, "SuggestionsAdapter"
final String v2 = "Search suggestions query threw an exception."; // const-string v2, "Search suggestions query threw an exception."
/* .line 7 */
android.util.Log .w ( v0,v2,p1 );
} // :cond_2
} // :goto_1
} // .end method
public final android.graphics.drawable.Drawable a ( android.content.ComponentName p0 ) {
/* .locals 6 */
final String v0 = "SuggestionsAdapter"; // const-string v0, "SuggestionsAdapter"
/* .line 65 */
v1 = this.e;
(( android.content.Context ) v1 ).getPackageManager ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* const/16 v2, 0x80 */
int v3 = 0; // const/4 v3, 0x0
/* .line 66 */
try { // :try_start_0
(( android.content.pm.PackageManager ) v1 ).getActivityInfo ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 67 */
v4 = (( android.content.pm.ActivityInfo ) v2 ).getIconResource ( ); // invoke-virtual {v2}, Landroid/content/pm/ActivityInfo;->getIconResource()I
/* if-nez v4, :cond_0 */
/* .line 68 */
} // :cond_0
(( android.content.ComponentName ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
/* .line 69 */
v2 = this.applicationInfo;
(( android.content.pm.PackageManager ) v1 ).getDrawable ( v5, v4, v2 ); // invoke-virtual {v1, v5, v4, v2}, Landroid/content/pm/PackageManager;->getDrawable(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
/* if-nez v1, :cond_1 */
/* .line 70 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid icon resource "; // const-string v2, "Invalid icon resource "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " for "; // const-string v2, " for "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 71 */
(( android.content.ComponentName ) p1 ).flattenToShortString ( ); // invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 72 */
android.util.Log .w ( v0,p1 );
} // :cond_1
/* :catch_0 */
/* move-exception p1 */
/* .line 73 */
(( android.content.pm.PackageManager$NameNotFoundException ) p1 ).toString ( ); // invoke-virtual {p1}, Landroid/content/pm/PackageManager$NameNotFoundException;->toString()Ljava/lang/String;
android.util.Log .w ( v0,p1 );
} // .end method
public final android.graphics.drawable.Drawable a ( android.net.Uri p0 ) {
/* .locals 6 */
final String v0 = "Error closing icon stream for "; // const-string v0, "Error closing icon stream for "
final String v1 = "SuggestionsAdapter"; // const-string v1, "SuggestionsAdapter"
int v2 = 0; // const/4 v2, 0x0
/* .line 49 */
try { // :try_start_0
(( android.net.Uri ) p1 ).getScheme ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
final String v4 = "android.resource"; // const-string v4, "android.resource"
/* .line 50 */
v3 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_3 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 51 */
try { // :try_start_1
(( c.b.q.f2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/f2;->b(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
/* :try_end_1 */
/* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_1 ..:try_end_1} :catch_3 */
/* .line 52 */
/* :catch_0 */
try { // :try_start_2
/* new-instance v0, Ljava/io/FileNotFoundException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Resource does not exist: "; // const-string v4, "Resource does not exist: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v3}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 53 */
} // :cond_0
v3 = this.o;
(( android.content.Context ) v3 ).getContentResolver ( ); // invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
(( android.content.ContentResolver ) v3 ).openInputStream ( p1 ); // invoke-virtual {v3, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
/* :try_end_2 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_2 ..:try_end_2} :catch_3 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 54 */
try { // :try_start_3
android.graphics.drawable.Drawable .createFromStream ( v3,v2 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 55 */
try { // :try_start_4
(( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_1 */
/* :catch_1 */
/* move-exception v3 */
/* .line 56 */
try { // :try_start_5
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v0,v3 );
/* :try_end_5 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_5 ..:try_end_5} :catch_3 */
} // :goto_0
/* :catchall_0 */
/* move-exception v4 */
/* .line 57 */
try { // :try_start_6
(( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_2 */
/* :catch_2 */
/* move-exception v3 */
/* .line 58 */
try { // :try_start_7
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v0,v3 );
/* .line 59 */
} // :goto_1
/* throw v4 */
/* .line 60 */
} // :cond_1
/* new-instance v0, Ljava/io/FileNotFoundException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Failed to open "; // const-string v4, "Failed to open "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v3}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :try_end_7 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_7 ..:try_end_7} :catch_3 */
/* :catch_3 */
/* move-exception v0 */
/* .line 61 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Icon not found: "; // const-string v4, "Icon not found: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = ", "; // const-string p1, ", "
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.FileNotFoundException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v1,p1 );
} // .end method
public final android.graphics.drawable.Drawable a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 62 */
v0 = this.p;
(( java.util.WeakHashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Landroid/graphics/drawable/Drawable$ConstantState; */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 63 */
} // :cond_0
(( android.graphics.drawable.Drawable$ConstantState ) p1 ).newDrawable ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;
} // .end method
public java.lang.CharSequence a ( android.database.Cursor p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
} // :cond_0
final String v1 = "suggest_intent_query"; // const-string v1, "suggest_intent_query"
/* .line 44 */
c.b.q.f2 .a ( p1,v1 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 45 */
} // :cond_1
v1 = this.n;
v1 = (( android.app.SearchableInfo ) v1 ).shouldRewriteQueryFromData ( ); // invoke-virtual {v1}, Landroid/app/SearchableInfo;->shouldRewriteQueryFromData()Z
if ( v1 != null) { // if-eqz v1, :cond_2
final String v1 = "suggest_intent_data"; // const-string v1, "suggest_intent_data"
/* .line 46 */
c.b.q.f2 .a ( p1,v1 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 47 */
} // :cond_2
v1 = this.n;
v1 = (( android.app.SearchableInfo ) v1 ).shouldRewriteQueryFromText ( ); // invoke-virtual {v1}, Landroid/app/SearchableInfo;->shouldRewriteQueryFromText()Z
if ( v1 != null) { // if-eqz v1, :cond_3
final String v1 = "suggest_text_1"; // const-string v1, "suggest_text_1"
/* .line 48 */
c.b.q.f2 .a ( p1,v1 );
if ( p1 != null) { // if-eqz p1, :cond_3
} // :cond_3
} // .end method
public void a ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/b/q/f2;->s:I */
return;
} // .end method
public void a ( android.view.View p0, android.content.Context p1, android.database.Cursor p2 ) {
/* .locals 6 */
/* .line 8 */
(( android.view.View ) p1 ).getTag ( ); // invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
/* check-cast p1, Lc/b/q/e2; */
/* .line 9 */
/* iget p2, p0, Lc/b/q/f2;->z:I */
int v0 = 0; // const/4 v0, 0x0
int v1 = -1; // const/4 v1, -0x1
/* if-eq p2, v1, :cond_0 */
p2 = /* .line 10 */
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
/* .line 11 */
} // :goto_0
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 12 */
/* iget v1, p0, Lc/b/q/f2;->u:I */
c.b.q.f2 .a ( p3,v1 );
/* .line 13 */
v2 = this.a;
(( c.b.q.f2 ) p0 ).a ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lc/b/q/f2;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
/* .line 14 */
} // :cond_1
v1 = this.b;
int v2 = 2; // const/4 v2, 0x2
int v3 = 1; // const/4 v3, 0x1
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 15 */
/* iget v1, p0, Lc/b/q/f2;->w:I */
c.b.q.f2 .a ( p3,v1 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 16 */
(( c.b.q.f2 ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lc/b/q/f2;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/* .line 17 */
} // :cond_2
/* iget v1, p0, Lc/b/q/f2;->v:I */
c.b.q.f2 .a ( p3,v1 );
/* .line 18 */
} // :goto_1
v4 = android.text.TextUtils .isEmpty ( v1 );
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 19 */
v4 = this.a;
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 20 */
(( android.widget.TextView ) v4 ).setSingleLine ( v0 ); // invoke-virtual {v4, v0}, Landroid/widget/TextView;->setSingleLine(Z)V
/* .line 21 */
v4 = this.a;
(( android.widget.TextView ) v4 ).setMaxLines ( v2 ); // invoke-virtual {v4, v2}, Landroid/widget/TextView;->setMaxLines(I)V
/* .line 22 */
} // :cond_3
v4 = this.a;
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 23 */
(( android.widget.TextView ) v4 ).setSingleLine ( v3 ); // invoke-virtual {v4, v3}, Landroid/widget/TextView;->setSingleLine(Z)V
/* .line 24 */
v4 = this.a;
(( android.widget.TextView ) v4 ).setMaxLines ( v3 ); // invoke-virtual {v4, v3}, Landroid/widget/TextView;->setMaxLines(I)V
/* .line 25 */
} // :cond_4
} // :goto_2
v4 = this.b;
(( c.b.q.f2 ) p0 ).a ( v4, v1 ); // invoke-virtual {p0, v4, v1}, Lc/b/q/f2;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
/* .line 26 */
} // :cond_5
v1 = this.c;
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 27 */
(( c.b.q.f2 ) p0 ).e ( p3 ); // invoke-virtual {p0, p3}, Lc/b/q/f2;->e(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
int v5 = 4; // const/4 v5, 0x4
(( c.b.q.f2 ) p0 ).a ( v1, v4, v5 ); // invoke-virtual {p0, v1, v4, v5}, Lc/b/q/f2;->a(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;I)V
/* .line 28 */
} // :cond_6
v1 = this.d;
/* const/16 v4, 0x8 */
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 29 */
(( c.b.q.f2 ) p0 ).f ( p3 ); // invoke-virtual {p0, p3}, Lc/b/q/f2;->f(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
(( c.b.q.f2 ) p0 ).a ( v1, p3, v4 ); // invoke-virtual {p0, v1, p3, v4}, Lc/b/q/f2;->a(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;I)V
/* .line 30 */
} // :cond_7
/* iget p3, p0, Lc/b/q/f2;->s:I */
/* if-eq p3, v2, :cond_9 */
/* if-ne p3, v3, :cond_8 */
/* and-int/2addr p2, v3 */
if ( p2 != null) { // if-eqz p2, :cond_8
/* .line 31 */
} // :cond_8
p1 = this.e;
(( android.widget.ImageView ) p1 ).setVisibility ( v4 ); // invoke-virtual {p1, v4}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 32 */
} // :cond_9
} // :goto_3
p2 = this.e;
(( android.widget.ImageView ) p2 ).setVisibility ( v0 ); // invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 33 */
p2 = this.e;
p3 = this.a;
(( android.widget.TextView ) p3 ).getText ( ); // invoke-virtual {p3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
(( android.widget.ImageView ) p2 ).setTag ( p3 ); // invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V
/* .line 34 */
p1 = this.e;
(( android.widget.ImageView ) p1 ).setOnClickListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
} // :goto_4
return;
} // .end method
public final void a ( android.widget.ImageView p0, android.graphics.drawable.Drawable p1, Integer p2 ) {
/* .locals 0 */
/* .line 39 */
(( android.widget.ImageView ) p1 ).setImageDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* if-nez p2, :cond_0 */
/* .line 40 */
(( android.widget.ImageView ) p1 ).setVisibility ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setVisibility(I)V
} // :cond_0
int p3 = 0; // const/4 p3, 0x0
/* .line 41 */
(( android.widget.ImageView ) p1 ).setVisibility ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 42 */
(( android.graphics.drawable.Drawable ) p2 ).setVisible ( p3, p3 ); // invoke-virtual {p2, p3, p3}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
int p1 = 1; // const/4 p1, 0x1
/* .line 43 */
(( android.graphics.drawable.Drawable ) p2 ).setVisible ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :goto_0
return;
} // .end method
public final void a ( android.widget.TextView p0, java.lang.CharSequence p1 ) {
/* .locals 0 */
/* .line 35 */
(( android.widget.TextView ) p1 ).setText ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 36 */
p2 = android.text.TextUtils .isEmpty ( p2 );
if ( p2 != null) { // if-eqz p2, :cond_0
/* const/16 p2, 0x8 */
/* .line 37 */
(( android.widget.TextView ) p1 ).setVisibility ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
/* .line 38 */
(( android.widget.TextView ) p1 ).setVisibility ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V
} // :goto_0
return;
} // .end method
public final void a ( java.lang.String p0, android.graphics.drawable.Drawable p1 ) {
/* .locals 1 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 64 */
v0 = this.p;
(( android.graphics.drawable.Drawable ) p2 ).getConstantState ( ); // invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
(( java.util.WeakHashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
return;
} // .end method
public final android.graphics.drawable.Drawable b ( android.content.ComponentName p0 ) {
/* .locals 3 */
/* .line 36 */
(( android.content.ComponentName ) p1 ).flattenToShortString ( ); // invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;
/* .line 37 */
v1 = this.p;
v1 = (( java.util.WeakHashMap ) v1 ).containsKey ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 38 */
p1 = this.p;
(( java.util.WeakHashMap ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Landroid/graphics/drawable/Drawable$ConstantState; */
/* if-nez p1, :cond_0 */
/* .line 39 */
} // :cond_0
v0 = this.o;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.graphics.drawable.Drawable$ConstantState ) p1 ).newDrawable ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
} // :goto_0
/* .line 40 */
} // :cond_1
(( c.b.q.f2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/f2;->a(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
/* if-nez p1, :cond_2 */
/* .line 41 */
} // :cond_2
(( android.graphics.drawable.Drawable ) p1 ).getConstantState ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
/* .line 42 */
} // :goto_1
v1 = this.p;
(( java.util.WeakHashMap ) v1 ).put ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public android.graphics.drawable.Drawable b ( android.net.Uri p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 43 */
(( android.net.Uri ) p1 ).getAuthority ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;
/* .line 44 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_4 */
/* .line 45 */
try { // :try_start_0
v1 = this.e;
(( android.content.Context ) v1 ).getPackageManager ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.pm.PackageManager ) v1 ).getResourcesForApplication ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 46 */
(( android.net.Uri ) p1 ).getPathSegments ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;
if ( v2 != null) { // if-eqz v2, :cond_3
v3 = /* .line 47 */
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
/* if-ne v3, v5, :cond_0 */
/* .line 48 */
try { // :try_start_1
/* check-cast v0, Ljava/lang/String; */
v0 = java.lang.Integer .parseInt ( v0 );
/* :try_end_1 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 49 */
/* :catch_0 */
/* new-instance v0, Ljava/io/FileNotFoundException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Single path segment is not a resource ID: "; // const-string v2, "Single path segment is not a resource ID: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
int v6 = 2; // const/4 v6, 0x2
/* if-ne v3, v6, :cond_2 */
/* .line 50 */
/* check-cast v3, Ljava/lang/String; */
/* check-cast v2, Ljava/lang/String; */
v0 = (( android.content.res.Resources ) v1 ).getIdentifier ( v3, v2, v0 ); // invoke-virtual {v1, v3, v2, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 51 */
(( android.content.res.Resources ) v1 ).getDrawable ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
/* .line 52 */
} // :cond_1
/* new-instance v0, Ljava/io/FileNotFoundException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "No resource found for: "; // const-string v2, "No resource found for: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 53 */
} // :cond_2
/* new-instance v0, Ljava/io/FileNotFoundException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "More than two path segments: "; // const-string v2, "More than two path segments: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 54 */
} // :cond_3
/* new-instance v0, Ljava/io/FileNotFoundException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "No path: "; // const-string v2, "No path: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 55 */
/* :catch_1 */
/* new-instance v0, Ljava/io/FileNotFoundException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "No package found for authority: "; // const-string v2, "No package found for authority: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 56 */
} // :cond_4
/* new-instance v0, Ljava/io/FileNotFoundException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "No authority: "; // const-string v2, "No authority: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final android.graphics.drawable.Drawable b ( java.lang.String p0 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 24 */
v1 = (( java.lang.String ) p1 ).isEmpty ( ); // invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z
/* if-nez v1, :cond_3 */
final String v1 = "0"; // const-string v1, "0"
v1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 25 */
} // :cond_0
try { // :try_start_0
v1 = java.lang.Integer .parseInt ( p1 );
/* .line 26 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "android.resource://"; // const-string v3, "android.resource://"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.o;
/* .line 27 */
(( android.content.Context ) v3 ).getPackageName ( ); // invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "/"; // const-string v3, "/"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 28 */
(( c.b.q.f2 ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lc/b/q/f2;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 29 */
} // :cond_1
v3 = this.o;
c.h.f.f .c ( v3,v1 );
/* .line 30 */
(( c.b.q.f2 ) p0 ).a ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lc/b/q/f2;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 31 */
/* :catch_0 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Icon resource not found: "; // const-string v2, "Icon resource not found: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "SuggestionsAdapter"; // const-string v1, "SuggestionsAdapter"
android.util.Log .w ( v1,p1 );
/* :catch_1 */
/* nop */
/* .line 32 */
(( c.b.q.f2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/f2;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 33 */
} // :cond_2
android.net.Uri .parse ( p1 );
/* .line 34 */
(( c.b.q.f2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/q/f2;->a(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
/* .line 35 */
(( c.b.q.f2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/b/q/f2;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
} // :cond_3
} // :goto_0
} // .end method
public android.view.View b ( android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2 ) {
/* .locals 0 */
/* .line 12 */
/* invoke-super {p0, p1, p2, p3}, Lc/i/a/f;->b(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View; */
/* .line 13 */
/* new-instance p2, Lc/b/q/e2; */
/* invoke-direct {p2, p1}, Lc/b/q/e2;-><init>(Landroid/view/View;)V */
(( android.view.View ) p1 ).setTag ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
/* .line 14 */
(( android.view.View ) p1 ).findViewById ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast p2, Landroid/widget/ImageView; */
/* .line 15 */
/* iget p3, p0, Lc/b/q/f2;->q:I */
(( android.widget.ImageView ) p2 ).setImageResource ( p3 ); // invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageResource(I)V
} // .end method
public final java.lang.CharSequence b ( java.lang.CharSequence p0 ) {
/* .locals 8 */
/* .line 16 */
v0 = this.t;
/* if-nez v0, :cond_0 */
/* .line 17 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
/* .line 18 */
v1 = this.e;
(( android.content.Context ) v1 ).getTheme ( ); // invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
int v3 = 1; // const/4 v3, 0x1
(( android.content.res.Resources$Theme ) v1 ).resolveAttribute ( v2, v0, v3 ); // invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
/* .line 19 */
v1 = this.e;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* iget v0, v0, Landroid/util/TypedValue;->resourceId:I */
(( android.content.res.Resources ) v1 ).getColorStateList ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;
this.t = v0;
/* .line 20 */
} // :cond_0
/* new-instance v0, Landroid/text/SpannableString; */
/* invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V */
/* .line 21 */
/* new-instance v7, Landroid/text/style/TextAppearanceSpan; */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
v5 = this.t;
int v6 = 0; // const/4 v6, 0x0
/* move-object v1, v7 */
/* invoke-direct/range {v1 ..v6}, Landroid/text/style/TextAppearanceSpan;-><init>(Ljava/lang/String;IILandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V */
int v1 = 0; // const/4 v1, 0x0
p1 = /* .line 22 */
/* const/16 v2, 0x21 */
/* .line 23 */
(( android.text.SpannableString ) v0 ).setSpan ( v7, v1, p1, v2 ); // invoke-virtual {v0, v7, v1, p1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V
} // .end method
public void b ( android.database.Cursor p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/q/f2;->r:Z */
final String v1 = "SuggestionsAdapter"; // const-string v1, "SuggestionsAdapter"
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "Tried to change cursor after adapter was closed."; // const-string v0, "Tried to change cursor after adapter was closed."
/* .line 2 */
android.util.Log .w ( v1,v0 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
} // :cond_0
return;
/* .line 4 */
} // :cond_1
try { // :try_start_0
/* invoke-super {p0, p1}, Lc/i/a/c;->b(Landroid/database/Cursor;)V */
if ( p1 != null) { // if-eqz p1, :cond_2
final String v0 = "suggest_text_1"; // const-string v0, "suggest_text_1"
v0 = /* .line 5 */
/* iput v0, p0, Lc/b/q/f2;->u:I */
final String v0 = "suggest_text_2"; // const-string v0, "suggest_text_2"
v0 = /* .line 6 */
/* iput v0, p0, Lc/b/q/f2;->v:I */
final String v0 = "suggest_text_2_url"; // const-string v0, "suggest_text_2_url"
v0 = /* .line 7 */
/* iput v0, p0, Lc/b/q/f2;->w:I */
final String v0 = "suggest_icon_1"; // const-string v0, "suggest_icon_1"
v0 = /* .line 8 */
/* iput v0, p0, Lc/b/q/f2;->x:I */
final String v0 = "suggest_icon_2"; // const-string v0, "suggest_icon_2"
v0 = /* .line 9 */
/* iput v0, p0, Lc/b/q/f2;->y:I */
final String v0 = "suggest_flags"; // const-string v0, "suggest_flags"
p1 = /* .line 10 */
/* iput p1, p0, Lc/b/q/f2;->z:I */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String v0 = "error changing cursor and caching columns"; // const-string v0, "error changing cursor and caching columns"
/* .line 11 */
android.util.Log .e ( v1,v0,p1 );
} // :cond_2
} // :goto_0
return;
} // .end method
public final android.graphics.drawable.Drawable d ( android.database.Cursor p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = this.n;
(( android.app.SearchableInfo ) p1 ).getSearchActivity ( ); // invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;
(( c.b.q.f2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/f2;->b(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
} // :cond_0
p1 = this.e;
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.pm.PackageManager ) p1 ).getDefaultActivityIcon ( ); // invoke-virtual {p1}, Landroid/content/pm/PackageManager;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;
} // .end method
public final android.graphics.drawable.Drawable e ( android.database.Cursor p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/f2;->x:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
/* .line 3 */
(( c.b.q.f2 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/b/q/f2;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
} // :cond_1
(( c.b.q.f2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/f2;->d(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
} // .end method
public final android.graphics.drawable.Drawable f ( android.database.Cursor p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/b/q/f2;->y:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
/* .line 3 */
(( c.b.q.f2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/f2;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
} // .end method
public final void g ( android.database.Cursor p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_1
final String v0 = "in_progress"; // const-string v0, "in_progress"
/* .line 2 */
p1 = (( android.os.Bundle ) p1 ).getBoolean ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
} // :cond_1
return;
} // .end method
public android.view.View getDropDownView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 1 */
/* .line 1 */
try { // :try_start_0
/* invoke-super {p0, p1, p2, p3}, Lc/i/a/c;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View; */
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String p2 = "SuggestionsAdapter"; // const-string p2, "SuggestionsAdapter"
final String v0 = "Search suggestions cursor threw exception."; // const-string v0, "Search suggestions cursor threw exception."
/* .line 2 */
android.util.Log .w ( p2,v0,p1 );
/* .line 3 */
p2 = this.e;
v0 = this.d;
(( c.i.a.f ) p0 ).a ( p2, v0, p3 ); // invoke-virtual {p0, p2, v0, p3}, Lc/i/a/f;->a(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 4 */
(( android.view.View ) p2 ).getTag ( ); // invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
/* check-cast p3, Lc/b/q/e2; */
/* .line 5 */
p3 = this.a;
/* .line 6 */
(( java.lang.RuntimeException ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;
(( android.widget.TextView ) p3 ).setText ( p1 ); // invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_0
} // .end method
public android.view.View getView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 1 */
/* .line 1 */
try { // :try_start_0
/* invoke-super {p0, p1, p2, p3}, Lc/i/a/c;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View; */
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String p2 = "SuggestionsAdapter"; // const-string p2, "SuggestionsAdapter"
final String v0 = "Search suggestions cursor threw exception."; // const-string v0, "Search suggestions cursor threw exception."
/* .line 2 */
android.util.Log .w ( p2,v0,p1 );
/* .line 3 */
p2 = this.e;
v0 = this.d;
(( c.b.q.f2 ) p0 ).b ( p2, v0, p3 ); // invoke-virtual {p0, p2, v0, p3}, Lc/b/q/f2;->b(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 4 */
(( android.view.View ) p2 ).getTag ( ); // invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
/* check-cast p3, Lc/b/q/e2; */
/* .line 5 */
p3 = this.a;
/* .line 6 */
(( java.lang.RuntimeException ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;
(( android.widget.TextView ) p3 ).setText ( p1 ); // invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_0
} // .end method
public Boolean hasStableIds ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void notifyDataSetChanged ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V */
/* .line 2 */
(( c.i.a.c ) p0 ).a ( ); // invoke-virtual {p0}, Lc/i/a/c;->a()Landroid/database/Cursor;
(( c.b.q.f2 ) p0 ).g ( v0 ); // invoke-virtual {p0, v0}, Lc/b/q/f2;->g(Landroid/database/Cursor;)V
return;
} // .end method
public void notifyDataSetInvalidated ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V */
/* .line 2 */
(( c.i.a.c ) p0 ).a ( ); // invoke-virtual {p0}, Lc/i/a/c;->a()Landroid/database/Cursor;
(( c.b.q.f2 ) p0 ).g ( v0 ); // invoke-virtual {p0, v0}, Lc/b/q/f2;->g(Landroid/database/Cursor;)V
return;
} // .end method
public void onClick ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.view.View ) p1 ).getTag ( ); // invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
/* .line 2 */
/* instance-of v0, p1, Ljava/lang/CharSequence; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.m;
/* check-cast p1, Ljava/lang/CharSequence; */
(( androidx.appcompat.widget.SearchView ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/SearchView;->b(Ljava/lang/CharSequence;)V
} // :cond_0
return;
} // .end method
