.class public final Lm/b/j/j0;
.super Lm/b/j/q0;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/StringBuilder;

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lm/b/j/q0;-><init>(Lm/b/j/h0;)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lm/b/j/j0;->b:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lm/b/j/j0;->c:Z

    .line 4
    sget-object v0, Lm/b/j/p0;->e:Lm/b/j/p0;

    iput-object v0, p0, Lm/b/j/q0;->a:Lm/b/j/p0;

    return-void
.end method


# virtual methods
.method public l()Lm/b/j/q0;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/j0;->b:Ljava/lang/StringBuilder;

    invoke-static {v0}, Lm/b/j/q0;->a(Ljava/lang/StringBuilder;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm/b/j/j0;->c:Z

    return-object p0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/j0;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<!--"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm/b/j/j0;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
