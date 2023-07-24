.class public Le/f/c/q/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/c/h;

.field public final b:Le/f/c/q/r;

.field public final c:Le/f/a/b/b/e;

.field public final d:Le/f/c/r/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/r/a<",
            "Le/f/c/v/h;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Le/f/c/r/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/r/a<",
            "Le/f/c/p/d;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Le/f/c/s/k;


# direct methods
.method public constructor <init>(Le/f/c/h;Le/f/c/q/r;Le/f/a/b/b/e;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/h;",
            "Le/f/c/q/r;",
            "Le/f/a/b/b/e;",
            "Le/f/c/r/a<",
            "Le/f/c/v/h;",
            ">;",
            "Le/f/c/r/a<",
            "Le/f/c/p/d;",
            ">;",
            "Le/f/c/s/k;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Le/f/c/q/o;->a:Le/f/c/h;

    .line 6
    iput-object p2, p0, Le/f/c/q/o;->b:Le/f/c/q/r;

    .line 7
    iput-object p3, p0, Le/f/c/q/o;->c:Le/f/a/b/b/e;

    .line 8
    iput-object p4, p0, Le/f/c/q/o;->d:Le/f/c/r/a;

    .line 9
    iput-object p5, p0, Le/f/c/q/o;->e:Le/f/c/r/a;

    .line 10
    iput-object p6, p0, Le/f/c/q/o;->f:Le/f/c/s/k;

    return-void
.end method

.method public constructor <init>(Le/f/c/h;Le/f/c/q/r;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/h;",
            "Le/f/c/q/r;",
            "Le/f/c/r/a<",
            "Le/f/c/v/h;",
            ">;",
            "Le/f/c/r/a<",
            "Le/f/c/p/d;",
            ">;",
            "Le/f/c/s/k;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v3, Le/f/a/b/b/e;

    .line 2
    invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0}, Le/f/a/b/b/e;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 3
    invoke-direct/range {v0 .. v6}, Le/f/c/q/o;-><init>(Le/f/c/h;Le/f/c/q/r;Le/f/a/b/b/e;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V

    return-void
.end method

.method public static a([B)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xb

    .line 3
    invoke-static {p0, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "SERVICE_NOT_AVAILABLE"

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "INTERNAL_SERVER_ERROR"

    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "InternalServerError"

    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 2

    const-string v0, "FirebaseInstanceId"

    const-string v1, "scope"

    .line 6
    invoke-virtual {p4, v1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "sender"

    .line 7
    invoke-virtual {p4, p3, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "subtype"

    .line 8
    invoke-virtual {p4, p3, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "appid"

    .line 9
    invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Le/f/c/q/o;->a:Le/f/c/h;

    invoke-virtual {p1}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object p1

    invoke-virtual {p1}, Le/f/c/i;->b()Ljava/lang/String;

    move-result-object p1

    const-string p2, "gmp_app_id"

    invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Le/f/c/q/o;->b:Le/f/c/q/r;

    invoke-virtual {p1}, Le/f/c/q/r;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "gmsv"

    invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "osv"

    invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    iget-object p1, p0, Le/f/c/q/o;->b:Le/f/c/q/r;

    invoke-virtual {p1}, Le/f/c/q/r;->a()Ljava/lang/String;

    move-result-object p1

    const-string p2, "app_ver"

    invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Le/f/c/q/o;->b:Le/f/c/q/r;

    invoke-virtual {p1}, Le/f/c/q/r;->b()Ljava/lang/String;

    move-result-object p1

    const-string p2, "app_ver_name"

    invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0}, Le/f/c/q/o;->a()Ljava/lang/String;

    move-result-object p1

    const-string p2, "firebase-app-name-hash"

    invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    :try_start_0
    iget-object p1, p0, Le/f/c/q/o;->f:Le/f/c/s/k;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Le/f/c/s/k;->a(Z)Le/f/a/b/h/g;

    move-result-object p1

    invoke-static {p1}, Le/f/a/b/h/n;->a(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/c/s/p;

    invoke-virtual {p1}, Le/f/c/s/p;->a()Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "Goog-Firebase-Installations-Auth"

    .line 18
    invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const-string p1, "FIS auth token is empty"

    .line 19
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    const-string p2, "Failed to get FIS auth token"

    .line 20
    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    const-string p1, "21.0.0"

    const-string p2, "fiid-"

    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_2
    const-string p2, "cliv"

    invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    iget-object p1, p0, Le/f/c/q/o;->e:Le/f/c/r/a;

    invoke-interface {p1}, Le/f/c/r/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/c/p/d;

    .line 23
    iget-object p2, p0, Le/f/c/q/o;->d:Le/f/c/r/a;

    invoke-interface {p2}, Le/f/c/r/a;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le/f/c/v/h;

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    const-string p3, "fire-iid"

    .line 24
    invoke-interface {p1, p3}, Le/f/c/p/d;->a(Ljava/lang/String;)Le/f/c/p/c;

    move-result-object p1

    .line 25
    sget-object p3, Le/f/c/p/c;->c:Le/f/c/p/c;

    if-eq p1, p3, :cond_2

    .line 26
    invoke-virtual {p1}, Le/f/c/p/c;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    const-string p3, "Firebase-Client-Log-Type"

    invoke-virtual {p4, p3, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    invoke-interface {p2}, Le/f/c/v/h;->a()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Firebase-Client"

    invoke-virtual {p4, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-object p4
.end method

.method public final a(Le/f/a/b/h/g;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/h/g<",
            "Landroid/os/Bundle;",
            ">;)",
            "Le/f/a/b/h/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 37
    invoke-static {}, Le/f/c/q/h;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Le/f/c/q/n;

    invoke-direct {v1, p0}, Le/f/c/q/n;-><init>(Le/f/c/q/o;)V

    .line 38
    invoke-virtual {p1, v0, v1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0, p1, p2, p3, v0}, Le/f/c/q/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Le/f/a/b/h/g;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Le/f/c/q/o;->a(Le/f/a/b/h/g;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final a()Ljava/lang/String;
    .locals 2

    .line 4
    iget-object v0, p0, Le/f/c/q/o;->a:Le/f/c/h;

    invoke-virtual {v0}, Le/f/c/h;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SHA-1"

    .line 5
    :try_start_0
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    invoke-static {v0}, Le/f/c/q/o;->a([B)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "[HASH-ERROR]"

    return-object v0
.end method

.method public final a(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "SERVICE_NOT_AVAILABLE"

    if-eqz p1, :cond_4

    const-string v1, "registration_id"

    .line 28
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    const-string v1, "unregistered"

    .line 29
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    const-string v1, "error"

    .line 30
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "RST"

    .line 31
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    if-eqz v1, :cond_2

    .line 32
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 33
    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x15

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unexpected response: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    const-string v2, "FirebaseInstanceId"

    invoke-static {v2, p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 34
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 35
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "INSTANCE_ID_RESET"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 36
    :cond_4
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Le/f/a/b/h/g<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, "/topics/"

    if-eqz v2, :cond_0

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    const-string v2, "gcm.topic"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v3, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_1

    :cond_1
    new-instance p3, Ljava/lang/String;

    invoke-direct {p3, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 4
    :goto_1
    invoke-virtual {p0, p1, p2, p3, v0}, Le/f/c/q/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Le/f/a/b/h/g;

    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Le/f/c/q/o;->a(Le/f/a/b/h/g;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Le/f/a/b/h/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            ")",
            "Le/f/a/b/h/g<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .line 6
    invoke-virtual {p0, p1, p2, p3, p4}, Le/f/c/q/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 7
    iget-object p1, p0, Le/f/c/q/o;->c:Le/f/a/b/b/e;

    invoke-virtual {p1, p4}, Le/f/a/b/b/e;->a(Landroid/os/Bundle;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Le/f/a/b/h/g;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 8
    const-class v0, Ljava/io/IOException;

    invoke-virtual {p1, v0}, Le/f/a/b/h/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Le/f/c/q/o;->a(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Le/f/a/b/h/g<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, "/topics/"

    if-eqz v2, :cond_0

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    const-string v2, "gcm.topic"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "delete"

    const-string v2, "1"

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v3, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_1

    :cond_1
    new-instance p3, Ljava/lang/String;

    invoke-direct {p3, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 5
    :goto_1
    invoke-virtual {p0, p1, p2, p3, v0}, Le/f/c/q/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Le/f/a/b/h/g;

    move-result-object p1

    .line 6
    invoke-virtual {p0, p1}, Le/f/c/q/o;->a(Le/f/a/b/h/g;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
