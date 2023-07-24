.class public Lk/w0;
.super Lk/x0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lk/i0;

.field public final synthetic b:Ljava/io/File;


# direct methods
.method public constructor <init>(Lk/i0;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/w0;->a:Lk/i0;

    iput-object p2, p0, Lk/w0;->b:Ljava/io/File;

    invoke-direct {p0}, Lk/x0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk/w0;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public a(Ll/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lk/w0;->b:Ljava/io/File;

    invoke-static {v1}, Ll/r;->a(Ljava/io/File;)Ll/y;

    move-result-object v0

    .line 3
    invoke-interface {p1, v0}, Ll/g;->a(Ll/y;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-static {v0}, Lk/e1/e;->a(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0}, Lk/e1/e;->a(Ljava/io/Closeable;)V

    throw p1
.end method

.method public b()Lk/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/w0;->a:Lk/i0;

    return-object v0
.end method
