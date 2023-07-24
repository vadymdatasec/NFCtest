.class public final Lokhttp3/internal/connection/RouteException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public b:Ljava/io/IOException;

.field public c:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 2
    iput-object p1, p0, Lokhttp3/internal/connection/RouteException;->b:Ljava/io/IOException;

    .line 3
    iput-object p1, p0, Lokhttp3/internal/connection/RouteException;->c:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public a()Ljava/io/IOException;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/RouteException;->b:Ljava/io/IOException;

    return-object v0
.end method

.method public a(Ljava/io/IOException;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lokhttp3/internal/connection/RouteException;->b:Ljava/io/IOException;

    invoke-static {v0, p1}, Lk/e1/e;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 3
    iput-object p1, p0, Lokhttp3/internal/connection/RouteException;->c:Ljava/io/IOException;

    return-void
.end method

.method public b()Ljava/io/IOException;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/RouteException;->c:Ljava/io/IOException;

    return-object v0
.end method
