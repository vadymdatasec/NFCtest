.class public Lk/e1/k/d0;
.super Ll/d;
.source "SourceFile"


# instance fields
.field public final synthetic k:Lk/e1/k/e0;


# direct methods
.method public constructor <init>(Lk/e1/k/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/e1/k/d0;->k:Lk/e1/k/e0;

    invoke-direct {p0}, Ll/d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ljava/net/SocketTimeoutException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public i()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk/e1/k/d0;->k:Lk/e1/k/e0;

    sget-object v1, Lk/e1/k/a;->h:Lk/e1/k/a;

    invoke-virtual {v0, v1}, Lk/e1/k/e0;->c(Lk/e1/k/a;)V

    return-void
.end method

.method public k()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ll/d;->h()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lk/e1/k/d0;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method
