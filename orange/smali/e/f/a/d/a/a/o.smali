.class public final Le/f/a/d/a/a/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Le/f/a/d/a/e/a;

.field public static final f:Landroid/content/Intent;


# instance fields
.field public a:Le/f/a/d/a/e/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/k<",
            "Le/f/a/d/a/e/h0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/String;

.field public final c:Landroid/content/Context;

.field public final d:Le/f/a/d/a/a/q;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/f/a/d/a/e/a;

    const-string v1, "AppUpdateService"

    invoke-direct {v0, v1}, Le/f/a/d/a/e/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Le/f/a/d/a/a/o;->e:Le/f/a/d/a/e/a;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.play.core.install.BIND_UPDATE_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    sput-object v0, Le/f/a/d/a/a/o;->f:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le/f/a/d/a/a/q;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/a/d/a/a/o;->b:Ljava/lang/String;

    iput-object p1, p0, Le/f/a/d/a/a/o;->c:Landroid/content/Context;

    iput-object p2, p0, Le/f/a/d/a/a/o;->d:Le/f/a/d/a/a/q;

    invoke-static {p1}, Le/f/a/d/a/e/n;->a(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Le/f/a/d/a/e/k;

    invoke-static {p1}, Le/f/a/d/a/g/a;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Le/f/a/d/a/a/o;->e:Le/f/a/d/a/e/a;

    sget-object v4, Le/f/a/d/a/a/o;->f:Landroid/content/Intent;

    sget-object v5, Le/f/a/d/a/a/k;->a:Le/f/a/d/a/e/g;

    const-string v3, "AppUpdateService"

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Le/f/a/d/a/e/k;-><init>(Landroid/content/Context;Le/f/a/d/a/e/a;Ljava/lang/String;Landroid/content/Intent;Le/f/a/d/a/e/g;)V

    iput-object p2, p0, Le/f/a/d/a/a/o;->a:Le/f/a/d/a/e/k;

    :cond_0
    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)I
    .locals 2

    const-string v0, "error.code"

    const/4 v1, -0x2

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static synthetic a(Le/f/a/d/a/a/o;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-static {}, Le/f/a/d/a/a/o;->c()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    const-string v1, "package.name"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    :try_start_0
    iget-object v1, p0, Le/f/a/d/a/a/o;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iget-object p0, p0, Le/f/a/d/a/a/o;->c:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-virtual {p0, v1, p1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p0, Le/f/a/d/a/a/o;->e:Le/f/a/d/a/e/a;

    new-array p1, p1, [Ljava/lang/Object;

    const-string v1, "The current version of the app could not be retrieved"

    invoke-virtual {p0, v1, p1}, Le/f/a/d/a/e/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const-string p1, "app.version.code"

    invoke-virtual {v0, p1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    return-object v0
.end method

.method public static synthetic a(Le/f/a/d/a/a/o;Landroid/os/Bundle;Ljava/lang/String;)Le/f/a/d/a/a/a;
    .locals 21

    move-object/from16 v0, p1

    const/4 v1, -0x1

    const-string v2, "version.code"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    const-string v2, "update.availability"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    const/4 v2, 0x0

    const-string v3, "install.status"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    const-string v3, "client.version.staleness"

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v7

    if-ne v7, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    move-object v7, v1

    const-string v1, "in.app.update.priority"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v8

    const-string v1, "bytes.downloaded"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v9

    const-string v1, "total.bytes.to.download"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v11

    const-string v1, "additional.size.required"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v13

    move-object/from16 v1, p0

    iget-object v1, v1, Le/f/a/d/a/a/o;->d:Le/f/a/d/a/a/q;

    invoke-virtual {v1}, Le/f/a/d/a/a/q;->a()J

    move-result-wide v15

    const-string v1, "blocking.intent"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Landroid/app/PendingIntent;

    const-string v1, "nonblocking.intent"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Landroid/app/PendingIntent;

    const-string v1, "blocking.destructive.intent"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Landroid/app/PendingIntent;

    const-string v1, "nonblocking.destructive.intent"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Landroid/app/PendingIntent;

    move-object/from16 v3, p2

    invoke-static/range {v3 .. v20}, Le/f/a/d/a/a/a;->a(Ljava/lang/String;IIILjava/lang/Integer;IJJJJLandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Le/f/a/d/a/a/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Le/f/a/d/a/e/a;
    .locals 1

    sget-object v0, Le/f/a/d/a/a/o;->e:Le/f/a/d/a/e/a;

    return-object v0
.end method

.method public static synthetic a(Le/f/a/d/a/a/o;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/a/o;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static b()Le/f/a/d/a/i/d;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Le/f/a/d/a/i/d<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Le/f/a/d/a/a/o;->e:Le/f/a/d/a/e/a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, -0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const-string v3, "onError(%d)"

    invoke-virtual {v0, v3, v1}, Le/f/a/d/a/e/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/play/core/install/InstallException;

    invoke-direct {v0, v2}, Lcom/google/android/play/core/install/InstallException;-><init>(I)V

    invoke-static {v0}, Le/f/a/d/a/i/f;->a(Ljava/lang/Exception;)Le/f/a/d/a/i/d;

    move-result-object v0

    return-object v0
.end method

.method public static c()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "playcore.version.code"

    const/16 v2, 0x2a33

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Le/f/a/d/a/i/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Le/f/a/d/a/i/d<",
            "Le/f/a/d/a/a/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/a/o;->a:Le/f/a/d/a/e/k;

    if-nez v0, :cond_0

    invoke-static {}, Le/f/a/d/a/a/o;->b()Le/f/a/d/a/i/d;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Le/f/a/d/a/a/o;->e:Le/f/a/d/a/e/a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "requestUpdateInfo(%s)"

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Le/f/a/d/a/i/o;

    invoke-direct {v0}, Le/f/a/d/a/i/o;-><init>()V

    iget-object v1, p0, Le/f/a/d/a/a/o;->a:Le/f/a/d/a/e/k;

    new-instance v2, Le/f/a/d/a/a/l;

    invoke-direct {v2, p0, v0, p1, v0}, Le/f/a/d/a/a/l;-><init>(Le/f/a/d/a/a/o;Le/f/a/d/a/i/o;Ljava/lang/String;Le/f/a/d/a/i/o;)V

    invoke-virtual {v1, v2}, Le/f/a/d/a/e/k;->a(Le/f/a/d/a/e/b;)V

    invoke-virtual {v0}, Le/f/a/d/a/i/o;->a()Le/f/a/d/a/i/d;

    move-result-object p1

    return-object p1
.end method
