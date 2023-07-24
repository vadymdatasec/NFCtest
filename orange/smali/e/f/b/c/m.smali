.class public final Le/f/b/c/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final e:Le/f/b/c/l;


# instance fields
.field public final b:Le/f/b/c/l;

.field public final c:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Ljava/io/Closeable;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/Throwable;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Le/f/b/c/k;->a()Le/f/b/c/k;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Le/f/b/c/j;->a:Le/f/b/c/j;

    :cond_0
    sput-object v0, Le/f/b/c/m;->e:Le/f/b/c/l;

    return-void
.end method

.method public constructor <init>(Le/f/b/c/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayDeque;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, Le/f/b/c/m;->c:Ljava/util/Deque;

    .line 3
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Le/f/b/c/l;

    iput-object p1, p0, Le/f/b/c/m;->b:Le/f/b/c/l;

    return-void
.end method

.method public static c()Le/f/b/c/m;
    .locals 2

    .line 1
    new-instance v0, Le/f/b/c/m;

    sget-object v1, Le/f/b/c/m;->e:Le/f/b/c/l;

    invoke-direct {v0, v1}, Le/f/b/c/m;-><init>(Le/f/b/c/l;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/io/Closeable;)Ljava/io/Closeable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Ljava/io/Closeable;",
            ">(TC;)TC;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Le/f/b/c/m;->c:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Le/f/b/c/m;->d:Ljava/lang/Throwable;

    .line 4
    const-class v0, Ljava/io/IOException;

    invoke-static {p1, v0}, Le/f/b/a/r;->b(Ljava/lang/Throwable;Ljava/lang/Class;)V

    .line 5
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public close()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/c/m;->d:Ljava/lang/Throwable;

    .line 2
    :goto_0
    iget-object v1, p0, Le/f/b/c/m;->c:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    iget-object v1, p0, Le/f/b/c/m;->c:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/Closeable;

    .line 4
    :try_start_0
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    if-nez v0, :cond_0

    move-object v0, v2

    goto :goto_0

    .line 5
    :cond_0
    iget-object v3, p0, Le/f/b/c/m;->b:Le/f/b/c/l;

    invoke-interface {v3, v1, v0, v2}, Le/f/b/c/l;->a(Ljava/io/Closeable;Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v1, p0, Le/f/b/c/m;->d:Ljava/lang/Throwable;

    if-nez v1, :cond_3

    if-nez v0, :cond_2

    goto :goto_1

    .line 7
    :cond_2
    const-class v1, Ljava/io/IOException;

    invoke-static {v0, v1}, Le/f/b/a/r;->b(Ljava/lang/Throwable;Ljava/lang/Class;)V

    .line 8
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_3
    :goto_1
    return-void
.end method
