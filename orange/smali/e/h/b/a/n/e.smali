.class public final Le/h/b/a/n/e;
.super Le/h/b/a/n/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Le/h/b/a/l/y0;)V
    .locals 1

    const-string v0, "badgeRecyclerViewAdapter"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Le/h/b/a/n/c;-><init>(Le/h/b/a/l/y0;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "zoneId"

    .line 1
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p1

    const-string v0, "contactlessId"

    .line 2
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p2

    .line 3
    iget-object v0, p0, Le/h/b/a/n/c;->a:Le/h/b/a/l/y0;

    invoke-virtual {v0, p2, p1}, Le/h/b/a/l/y0;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)I

    move-result p1

    .line 4
    iget-object p2, p0, Le/h/b/a/n/c;->a:Le/h/b/a/l/y0;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->c(I)V

    return-void
.end method
