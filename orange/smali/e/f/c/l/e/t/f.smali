.class public Le/f/c/l/e/t/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:[S


# instance fields
.field public final a:Le/f/c/l/e/t/h/c;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Le/f/c/l/e/m/j1;

.field public final e:Le/f/c/l/e/t/a;

.field public final f:Le/f/c/l/e/t/b;

.field public g:Ljava/lang/Thread;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    new-array v0, v0, [S

    .line 1
    fill-array-data v0, :array_0

    sput-object v0, Le/f/c/l/e/t/f;->h:[S

    return-void

    nop

    :array_0
    .array-data 2
        0xas
        0x14s
        0x1es
        0x3cs
        0x78s
        0x12cs
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/j1;Le/f/c/l/e/t/a;Le/f/c/l/e/t/h/c;Le/f/c/l/e/t/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p5, :cond_0

    .line 2
    iput-object p5, p0, Le/f/c/l/e/t/f;->a:Le/f/c/l/e/t/h/c;

    .line 3
    iput-object p1, p0, Le/f/c/l/e/t/f;->b:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Le/f/c/l/e/t/f;->c:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Le/f/c/l/e/t/f;->d:Le/f/c/l/e/m/j1;

    .line 6
    iput-object p4, p0, Le/f/c/l/e/t/f;->e:Le/f/c/l/e/t/a;

    .line 7
    iput-object p6, p0, Le/f/c/l/e/t/f;->f:Le/f/c/l/e/t/b;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "createReportCall must not be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Le/f/c/l/e/t/f;)Le/f/c/l/e/t/b;
    .locals 0

    .line 2
    iget-object p0, p0, Le/f/c/l/e/t/f;->f:Le/f/c/l/e/t/b;

    return-object p0
.end method

.method public static synthetic a(Le/f/c/l/e/t/f;Ljava/lang/Thread;)Ljava/lang/Thread;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/t/f;->g:Ljava/lang/Thread;

    return-object p1
.end method

.method public static synthetic a()[S
    .locals 1

    .line 3
    sget-object v0, Le/f/c/l/e/t/f;->h:[S

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/util/List;ZF)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/f/c/l/e/t/g/d;",
            ">;ZF)V"
        }
    .end annotation

    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Le/f/c/l/e/t/f;->g:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string p2, "Report upload has already been started."

    invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p0

    return-void

    .line 7
    :cond_0
    :try_start_1
    new-instance v0, Le/f/c/l/e/t/e;

    invoke-direct {v0, p0, p1, p2, p3}, Le/f/c/l/e/t/e;-><init>(Le/f/c/l/e/t/f;Ljava/util/List;ZF)V

    .line 8
    new-instance p1, Ljava/lang/Thread;

    const-string p2, "Crashlytics Report Uploader"

    invoke-direct {p1, v0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object p1, p0, Le/f/c/l/e/t/f;->g:Ljava/lang/Thread;

    .line 9
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Le/f/c/l/e/t/g/d;Z)Z
    .locals 5

    const/4 v0, 0x0

    .line 11
    :try_start_0
    new-instance v1, Le/f/c/l/e/t/g/a;

    iget-object v2, p0, Le/f/c/l/e/t/f;->b:Ljava/lang/String;

    iget-object v3, p0, Le/f/c/l/e/t/f;->c:Ljava/lang/String;

    invoke-direct {v1, v2, v3, p1}, Le/f/c/l/e/t/g/a;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/t/g/d;)V

    .line 12
    iget-object v2, p0, Le/f/c/l/e/t/f;->d:Le/f/c/l/e/m/j1;

    sget-object v3, Le/f/c/l/e/m/j1;->d:Le/f/c/l/e/m/j1;

    const/4 v4, 0x1

    if-ne v2, v3, :cond_0

    .line 13
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p2

    const-string v1, "Send to Reports Endpoint disabled. Removing Reports Endpoint report."

    .line 14
    invoke-virtual {p2, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :cond_0
    iget-object v2, p0, Le/f/c/l/e/t/f;->d:Le/f/c/l/e/m/j1;

    sget-object v3, Le/f/c/l/e/m/j1;->c:Le/f/c/l/e/m/j1;

    if-ne v2, v3, :cond_1

    .line 16
    invoke-interface {p1}, Le/f/c/l/e/t/g/d;->e()Le/f/c/l/e/t/g/c;

    move-result-object v2

    sget-object v3, Le/f/c/l/e/t/g/c;->b:Le/f/c/l/e/t/g/c;

    if-ne v2, v3, :cond_1

    .line 17
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p2

    const-string v1, "Send to Reports Endpoint for non-native reports disabled. Removing Reports Uploader report."

    .line 18
    invoke-virtual {p2, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    :goto_0
    const/4 p2, 0x1

    goto :goto_2

    .line 19
    :cond_1
    iget-object v2, p0, Le/f/c/l/e/t/f;->a:Le/f/c/l/e/t/h/c;

    invoke-interface {v2, v1, p2}, Le/f/c/l/e/t/h/c;->a(Le/f/c/l/e/t/g/a;Z)Z

    move-result p2

    .line 20
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Crashlytics Reports Endpoint upload "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_2

    const-string v3, "complete: "

    goto :goto_1

    :cond_2
    const-string v3, "FAILED: "

    .line 21
    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    invoke-interface {p1}, Le/f/c/l/e/t/g/d;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Le/f/c/l/e/b;->c(Ljava/lang/String;)V

    :goto_2
    if-eqz p2, :cond_3

    .line 24
    iget-object p2, p0, Le/f/c/l/e/t/f;->e:Le/f/c/l/e/t/a;

    invoke-virtual {p2, p1}, Le/f/c/l/e/t/a;->a(Le/f/c/l/e/t/g/d;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_3

    :catch_0
    move-exception p2

    .line 25
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error occurred sending report "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, p2}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    return v0
.end method
