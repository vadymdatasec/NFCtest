.class public Lk/e1/k/o;
.super Lk/e1/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Lk/e1/k/a;

.field public final synthetic e:Lk/e1/k/x;


# direct methods
.method public varargs constructor <init>(Lk/e1/k/x;Ljava/lang/String;[Ljava/lang/Object;ILk/e1/k/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/e1/k/o;->e:Lk/e1/k/x;

    iput p4, p0, Lk/e1/k/o;->c:I

    iput-object p5, p0, Lk/e1/k/o;->d:Lk/e1/k/a;

    invoke-direct {p0, p2, p3}, Lk/e1/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk/e1/k/o;->e:Lk/e1/k/x;

    iget-object v0, v0, Lk/e1/k/x;->k:Lk/e1/k/j0;

    iget v1, p0, Lk/e1/k/o;->c:I

    iget-object v2, p0, Lk/e1/k/o;->d:Lk/e1/k/a;

    invoke-interface {v0, v1, v2}, Lk/e1/k/j0;->a(ILk/e1/k/a;)V

    .line 2
    iget-object v0, p0, Lk/e1/k/o;->e:Lk/e1/k/x;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lk/e1/k/o;->e:Lk/e1/k/x;

    iget-object v1, v1, Lk/e1/k/x;->u:Ljava/util/Set;

    iget v2, p0, Lk/e1/k/o;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
