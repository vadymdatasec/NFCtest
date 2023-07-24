.class public Lk/e1/k/m;
.super Lk/e1/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Z

.field public final synthetic f:Lk/e1/k/x;


# direct methods
.method public varargs constructor <init>(Lk/e1/k/x;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/e1/k/m;->f:Lk/e1/k/x;

    iput p4, p0, Lk/e1/k/m;->c:I

    iput-object p5, p0, Lk/e1/k/m;->d:Ljava/util/List;

    iput-boolean p6, p0, Lk/e1/k/m;->e:Z

    invoke-direct {p0, p2, p3}, Lk/e1/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk/e1/k/m;->f:Lk/e1/k/x;

    iget-object v0, v0, Lk/e1/k/x;->k:Lk/e1/k/j0;

    iget v1, p0, Lk/e1/k/m;->c:I

    iget-object v2, p0, Lk/e1/k/m;->d:Ljava/util/List;

    iget-boolean v3, p0, Lk/e1/k/m;->e:Z

    invoke-interface {v0, v1, v2, v3}, Lk/e1/k/j0;->a(ILjava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object v1, p0, Lk/e1/k/m;->f:Lk/e1/k/x;

    iget-object v1, v1, Lk/e1/k/x;->s:Lk/e1/k/f0;

    iget v2, p0, Lk/e1/k/m;->c:I

    sget-object v3, Lk/e1/k/a;->h:Lk/e1/k/a;

    invoke-virtual {v1, v2, v3}, Lk/e1/k/f0;->a(ILk/e1/k/a;)V

    :cond_0
    if-nez v0, :cond_1

    .line 3
    iget-boolean v0, p0, Lk/e1/k/m;->e:Z

    if-eqz v0, :cond_2

    .line 4
    :cond_1
    iget-object v0, p0, Lk/e1/k/m;->f:Lk/e1/k/x;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    :try_start_1
    iget-object v1, p0, Lk/e1/k/m;->f:Lk/e1/k/x;

    iget-object v1, v1, Lk/e1/k/x;->u:Ljava/util/Set;

    iget v2, p0, Lk/e1/k/m;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 6
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method
