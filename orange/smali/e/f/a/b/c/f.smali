.class public Le/f/a/b/c/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Le/f/a/b/c/h;->a:I

    sput v0, Le/f/a/b/c/f;->a:I

    .line 2
    new-instance v0, Le/f/a/b/c/f;

    invoke-direct {v0}, Le/f/a/b/c/f;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gcore_"

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    sget v1, Le/f/a/b/c/f;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-"

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p0, :cond_1

    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p0, :cond_2

    .line 22
    :try_start_0
    invoke-static {p0}, Le/f/a/b/c/q/b;->b(Landroid/content/Context;)Le/f/a/b/c/q/a;

    move-result-object p1

    .line 23
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v1}, Le/f/a/b/c/q/a;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 24
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :catch_0
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroid/content/Context;)I
    .locals 1

    .line 1
    sget v0, Le/f/a/b/c/f;->a:I

    invoke-virtual {p0, p1, v0}, Le/f/a/b/c/f;->a(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method

.method public a(Landroid/content/Context;I)I
    .locals 0

    .line 2
    invoke-static {p1, p2}, Le/f/a/b/c/h;->a(Landroid/content/Context;I)I

    move-result p2

    .line 3
    invoke-static {p1, p2}, Le/f/a/b/c/h;->b(Landroid/content/Context;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p2, 0x12

    :cond_0
    return p2
.end method

.method public a(Landroid/content/Context;II)Landroid/app/PendingIntent;
    .locals 1

    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, p1, p2, p3, v0}, Le/f/a/b/c/f;->a(Landroid/content/Context;IILjava/lang/String;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;IILjava/lang/String;)Landroid/app/PendingIntent;
    .locals 0

    .line 10
    invoke-virtual {p0, p1, p2, p4}, Le/f/a/b/c/f;->a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/high16 p4, 0x8000000

    .line 11
    invoke-static {p1, p3, p2, p4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;
    .locals 2

    const/4 v0, 0x1

    const-string v1, "com.google.android.gms"

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 p1, 0x3

    if-eq p2, p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    invoke-static {v1}, Le/f/a/b/c/m/l;->a(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz p1, :cond_2

    .line 5
    invoke-static {p1}, Le/f/a/b/c/p/e;->c(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 6
    invoke-static {}, Le/f/a/b/c/m/l;->a()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    .line 7
    :cond_2
    invoke-static {p1, p3}, Le/f/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-static {v1, p1}, Le/f/a/b/c/m/l;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public a(I)Ljava/lang/String;
    .locals 0

    .line 12
    invoke-static {p1}, Le/f/a/b/c/h;->a(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(I)Z
    .locals 0

    .line 1
    invoke-static {p1}, Le/f/a/b/c/h;->b(I)Z

    move-result p1

    return p1
.end method
