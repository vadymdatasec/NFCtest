.class public final enum Lm/b/j/d3;
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
    .locals 2

    const-string v0, "]]>"

    .line 1
    invoke-virtual {p2, v0}, Lm/b/j/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {p1, v1}, Lm/b/j/s0;->b(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2, v0}, Lm/b/j/a;->c(Ljava/lang/String;)Z

    .line 4
    sget-object p2, Lm/b/j/i3;->b:Lm/b/j/i3;

    invoke-virtual {p1, p2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    return-void
.end method