.class public Lk/e1/k/t;
.super Lk/e1/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lk/e1/k/e0;

.field public final synthetic d:Lk/e1/k/w;


# direct methods
.method public varargs constructor <init>(Lk/e1/k/w;Ljava/lang/String;[Ljava/lang/Object;Lk/e1/k/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/e1/k/t;->d:Lk/e1/k/w;

    iput-object p4, p0, Lk/e1/k/t;->c:Lk/e1/k/e0;

    invoke-direct {p0, p2, p3}, Lk/e1/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lk/e1/k/t;->d:Lk/e1/k/w;

    iget-object v0, v0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object v0, v0, Lk/e1/k/x;->c:Lk/e1/k/r;

    iget-object v1, p0, Lk/e1/k/t;->c:Lk/e1/k/e0;

    invoke-virtual {v0, v1}, Lk/e1/k/r;->a(Lk/e1/k/e0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    invoke-static {}, Lk/e1/l/j;->c()Lk/e1/l/j;

    move-result-object v1

    const/4 v2, 0x4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Http2Connection.Listener failure for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lk/e1/k/t;->d:Lk/e1/k/w;

    iget-object v4, v4, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object v4, v4, Lk/e1/k/x;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lk/e1/l/j;->a(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 3
    :try_start_1
    iget-object v0, p0, Lk/e1/k/t;->c:Lk/e1/k/e0;

    sget-object v1, Lk/e1/k/a;->d:Lk/e1/k/a;

    invoke-virtual {v0, v1}, Lk/e1/k/e0;->a(Lk/e1/k/a;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    return-void
.end method
