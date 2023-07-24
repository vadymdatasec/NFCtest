.class public Le/c/a/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public A:Ljava/lang/String;

.field public B:Ljava/lang/Boolean;

.field public C:Ljava/lang/Boolean;

.field public D:Le/c/a/i1;

.field public E:Ljava/lang/Float;

.field public F:Ljava/lang/String;

.field public G:Le/c/a/q0;

.field public H:Ljava/lang/String;

.field public I:Le/c/a/i1;

.field public J:Ljava/lang/Float;

.field public K:Le/c/a/i1;

.field public L:Ljava/lang/Float;

.field public M:Le/c/a/x0;

.field public b:J

.field public c:Le/c/a/i1;

.field public d:Le/c/a/q0;

.field public e:Ljava/lang/Float;

.field public f:Le/c/a/i1;

.field public g:Ljava/lang/Float;

.field public h:Le/c/a/b0;

.field public i:Le/c/a/s0;

.field public j:Le/c/a/t0;

.field public k:Ljava/lang/Float;

.field public l:[Le/c/a/b0;

.field public m:Le/c/a/b0;

.field public n:Ljava/lang/Float;

.field public o:Le/c/a/r;

.field public p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public q:Le/c/a/b0;

.field public r:Ljava/lang/Integer;

.field public s:Le/c/a/r0;

.field public t:Le/c/a/v0;

.field public u:Le/c/a/w0;

.field public v:Le/c/a/u0;

.field public w:Ljava/lang/Boolean;

.field public x:Le/c/a/o;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Le/c/a/y0;->b:J

    return-void
.end method

.method public static a()Le/c/a/y0;
    .locals 6

    .line 1
    new-instance v0, Le/c/a/y0;

    invoke-direct {v0}, Le/c/a/y0;-><init>()V

    const-wide/16 v1, -0x1

    .line 2
    iput-wide v1, v0, Le/c/a/y0;->b:J

    .line 3
    sget-object v1, Le/c/a/r;->c:Le/c/a/r;

    iput-object v1, v0, Le/c/a/y0;->c:Le/c/a/i1;

    .line 4
    sget-object v1, Le/c/a/q0;->b:Le/c/a/q0;

    iput-object v1, v0, Le/c/a/y0;->d:Le/c/a/q0;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iput-object v2, v0, Le/c/a/y0;->e:Ljava/lang/Float;

    const/4 v3, 0x0

    .line 6
    iput-object v3, v0, Le/c/a/y0;->f:Le/c/a/i1;

    .line 7
    iput-object v2, v0, Le/c/a/y0;->g:Ljava/lang/Float;

    .line 8
    new-instance v4, Le/c/a/b0;

    invoke-direct {v4, v1}, Le/c/a/b0;-><init>(F)V

    iput-object v4, v0, Le/c/a/y0;->h:Le/c/a/b0;

    .line 9
    sget-object v1, Le/c/a/s0;->b:Le/c/a/s0;

    iput-object v1, v0, Le/c/a/y0;->i:Le/c/a/s0;

    .line 10
    sget-object v1, Le/c/a/t0;->b:Le/c/a/t0;

    iput-object v1, v0, Le/c/a/y0;->j:Le/c/a/t0;

    const/high16 v1, 0x40800000    # 4.0f

    .line 11
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, v0, Le/c/a/y0;->k:Ljava/lang/Float;

    .line 12
    iput-object v3, v0, Le/c/a/y0;->l:[Le/c/a/b0;

    .line 13
    new-instance v1, Le/c/a/b0;

    const/4 v4, 0x0

    invoke-direct {v1, v4}, Le/c/a/b0;-><init>(F)V

    iput-object v1, v0, Le/c/a/y0;->m:Le/c/a/b0;

    .line 14
    iput-object v2, v0, Le/c/a/y0;->n:Ljava/lang/Float;

    .line 15
    sget-object v1, Le/c/a/r;->c:Le/c/a/r;

    iput-object v1, v0, Le/c/a/y0;->o:Le/c/a/r;

    .line 16
    iput-object v3, v0, Le/c/a/y0;->p:Ljava/util/List;

    .line 17
    new-instance v1, Le/c/a/b0;

    sget-object v4, Le/c/a/x1;->h:Le/c/a/x1;

    const/high16 v5, 0x41400000    # 12.0f

    invoke-direct {v1, v5, v4}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    iput-object v1, v0, Le/c/a/y0;->q:Le/c/a/b0;

    const/16 v1, 0x190

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Le/c/a/y0;->r:Ljava/lang/Integer;

    .line 19
    sget-object v1, Le/c/a/r0;->b:Le/c/a/r0;

    iput-object v1, v0, Le/c/a/y0;->s:Le/c/a/r0;

    .line 20
    sget-object v1, Le/c/a/v0;->b:Le/c/a/v0;

    iput-object v1, v0, Le/c/a/y0;->t:Le/c/a/v0;

    .line 21
    sget-object v1, Le/c/a/w0;->b:Le/c/a/w0;

    iput-object v1, v0, Le/c/a/y0;->u:Le/c/a/w0;

    .line 22
    sget-object v1, Le/c/a/u0;->b:Le/c/a/u0;

    iput-object v1, v0, Le/c/a/y0;->v:Le/c/a/u0;

    const/4 v1, 0x1

    .line 23
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Le/c/a/y0;->w:Ljava/lang/Boolean;

    .line 24
    iput-object v3, v0, Le/c/a/y0;->x:Le/c/a/o;

    .line 25
    iput-object v3, v0, Le/c/a/y0;->y:Ljava/lang/String;

    .line 26
    iput-object v3, v0, Le/c/a/y0;->z:Ljava/lang/String;

    .line 27
    iput-object v3, v0, Le/c/a/y0;->A:Ljava/lang/String;

    .line 28
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Le/c/a/y0;->B:Ljava/lang/Boolean;

    .line 29
    iput-object v1, v0, Le/c/a/y0;->C:Ljava/lang/Boolean;

    .line 30
    sget-object v1, Le/c/a/r;->c:Le/c/a/r;

    iput-object v1, v0, Le/c/a/y0;->D:Le/c/a/i1;

    .line 31
    iput-object v2, v0, Le/c/a/y0;->E:Ljava/lang/Float;

    .line 32
    iput-object v3, v0, Le/c/a/y0;->F:Ljava/lang/String;

    .line 33
    sget-object v1, Le/c/a/q0;->b:Le/c/a/q0;

    iput-object v1, v0, Le/c/a/y0;->G:Le/c/a/q0;

    .line 34
    iput-object v3, v0, Le/c/a/y0;->H:Ljava/lang/String;

    .line 35
    iput-object v3, v0, Le/c/a/y0;->I:Le/c/a/i1;

    .line 36
    iput-object v2, v0, Le/c/a/y0;->J:Ljava/lang/Float;

    .line 37
    iput-object v3, v0, Le/c/a/y0;->K:Le/c/a/i1;

    .line 38
    iput-object v2, v0, Le/c/a/y0;->L:Ljava/lang/Float;

    .line 39
    sget-object v1, Le/c/a/x0;->b:Le/c/a/x0;

    iput-object v1, v0, Le/c/a/y0;->M:Le/c/a/x0;

    return-object v0
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .line 40
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Le/c/a/y0;->B:Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    iput-object v0, p0, Le/c/a/y0;->w:Ljava/lang/Boolean;

    const/4 p1, 0x0

    .line 42
    iput-object p1, p0, Le/c/a/y0;->x:Le/c/a/o;

    .line 43
    iput-object p1, p0, Le/c/a/y0;->F:Ljava/lang/String;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 44
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p0, Le/c/a/y0;->n:Ljava/lang/Float;

    .line 45
    sget-object v1, Le/c/a/r;->c:Le/c/a/r;

    iput-object v1, p0, Le/c/a/y0;->D:Le/c/a/i1;

    .line 46
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p0, Le/c/a/y0;->E:Ljava/lang/Float;

    .line 47
    iput-object p1, p0, Le/c/a/y0;->H:Ljava/lang/String;

    .line 48
    iput-object p1, p0, Le/c/a/y0;->I:Le/c/a/i1;

    .line 49
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p0, Le/c/a/y0;->J:Ljava/lang/Float;

    .line 50
    iput-object p1, p0, Le/c/a/y0;->K:Le/c/a/i1;

    .line 51
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Le/c/a/y0;->L:Ljava/lang/Float;

    .line 52
    sget-object p1, Le/c/a/x0;->b:Le/c/a/x0;

    iput-object p1, p0, Le/c/a/y0;->M:Le/c/a/x0;

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/y0;

    .line 2
    iget-object v1, p0, Le/c/a/y0;->l:[Le/c/a/b0;

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Le/c/a/y0;->l:[Le/c/a/b0;

    invoke-virtual {v1}, [Le/c/a/b0;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Le/c/a/b0;

    iput-object v1, v0, Le/c/a/y0;->l:[Le/c/a/b0;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    .line 4
    new-instance v1, Ljava/lang/InternalError;

    invoke-virtual {v0}, Ljava/lang/CloneNotSupportedException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v1
.end method
