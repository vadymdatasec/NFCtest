.class public Lm/b/i/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm/b/k/s0;


# instance fields
.field public final synthetic a:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>(Lm/b/i/l;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lm/b/i/k;->a:Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm/b/i/t;I)V
    .locals 0

    return-void
.end method

.method public b(Lm/b/i/t;I)V
    .locals 0

    .line 1
    instance-of p2, p1, Lm/b/i/u;

    if-eqz p2, :cond_0

    .line 2
    check-cast p1, Lm/b/i/u;

    .line 3
    iget-object p2, p0, Lm/b/i/k;->a:Ljava/lang/StringBuilder;

    invoke-static {p2, p1}, Lm/b/i/l;->a(Ljava/lang/StringBuilder;Lm/b/i/u;)V

    goto :goto_0

    .line 4
    :cond_0
    instance-of p2, p1, Lm/b/i/l;

    if-eqz p2, :cond_2

    .line 5
    check-cast p1, Lm/b/i/l;

    .line 6
    iget-object p2, p0, Lm/b/i/k;->a:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    if-lez p2, :cond_2

    .line 7
    invoke-virtual {p1}, Lm/b/i/l;->x()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-static {p1}, Lm/b/i/l;->a(Lm/b/i/l;)Lm/b/j/g0;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/j/g0;->b()Ljava/lang/String;

    move-result-object p1

    const-string p2, "br"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    iget-object p1, p0, Lm/b/i/k;->a:Ljava/lang/StringBuilder;

    .line 8
    invoke-static {p1}, Lm/b/i/u;->a(Ljava/lang/StringBuilder;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 9
    iget-object p1, p0, Lm/b/i/k;->a:Ljava/lang/StringBuilder;

    const-string p2, " "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_0
    return-void
.end method
