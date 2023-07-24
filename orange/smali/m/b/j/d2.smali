.class public final enum Lm/b/j/d2;
.super Lm/b/j/i3;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lm/b/j/i3;-><init>(Ljava/lang/String;ILm/b/j/d1;)V

    return-void
.end method


# virtual methods
.method public a(Lm/b/j/s0;Lm/b/j/a;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lm/b/j/a;->q()V

    .line 2
    new-instance v0, Lm/b/j/j0;

    invoke-direct {v0}, Lm/b/j/j0;-><init>()V

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, v0, Lm/b/j/j0;->c:Z

    .line 4
    iget-object v1, v0, Lm/b/j/j0;->b:Ljava/lang/StringBuilder;

    const/16 v2, 0x3e

    invoke-virtual {p2, v2}, Lm/b/j/a;->a(C)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {p1, v0}, Lm/b/j/s0;->a(Lm/b/j/q0;)V

    .line 6
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->a(Lm/b/j/i3;)V

    return-void
.end method
