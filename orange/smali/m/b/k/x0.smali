.class public Lm/b/k/x0;
.super Lm/b/k/b1;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lm/b/k/q0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm/b/k/b1;-><init>()V

    .line 2
    iput-object p1, p0, Lm/b/k/b1;->a:Lm/b/k/q0;

    return-void
.end method


# virtual methods
.method public a(Lm/b/i/l;Lm/b/i/l;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/k/b1;->a:Lm/b/k/q0;

    invoke-virtual {v0, p1, p2}, Lm/b/k/q0;->a(Lm/b/i/l;Lm/b/i/l;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lm/b/k/b1;->a:Lm/b/k/q0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, ":not%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
