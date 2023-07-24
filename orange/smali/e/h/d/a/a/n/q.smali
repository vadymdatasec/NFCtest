.class public Le/h/d/a/a/n/q;
.super Le/h/d/a/a/n/p;
.source "SourceFile"


# instance fields
.field public final synthetic g:Lcom/orange/oab/contactless/packid/hce/user/User;

.field public final synthetic h:Z

.field public final synthetic i:Le/h/d/a/a/n/r;


# direct methods
.method public constructor <init>(Le/h/d/a/a/n/r;Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/h/d/a/a/n/q;->i:Le/h/d/a/a/n/r;

    iput-object p3, p0, Le/h/d/a/a/n/q;->g:Lcom/orange/oab/contactless/packid/hce/user/User;

    iput-boolean p4, p0, Le/h/d/a/a/n/q;->h:Z

    invoke-direct {p0, p2}, Le/h/d/a/a/n/p;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a(Le/h/d/a/a/p/a/a/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Le/h/d/a/a/n/q;->i:Le/h/d/a/a/n/r;

    iget-object v1, p0, Le/h/d/a/a/n/q;->g:Lcom/orange/oab/contactless/packid/hce/user/User;

    iget-boolean v2, p0, Le/h/d/a/a/n/p;->b:Z

    iget-boolean v3, p0, Le/h/d/a/a/n/q;->h:Z

    invoke-static {v0, v1, p1, v2, v3}, Le/h/d/a/a/n/r;->a(Le/h/d/a/a/n/r;Lcom/orange/oab/contactless/packid/hce/user/User;Le/h/d/a/a/p/a/a/a;ZZ)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;Lfr/mbs/binary/Octets;)V
    .locals 3

    .line 2
    invoke-super {p0, p1, p2}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;Lfr/mbs/binary/Octets;)V

    .line 3
    iget-object p1, p0, Le/h/d/a/a/n/q;->i:Le/h/d/a/a/n/r;

    iget-object p2, p0, Le/h/d/a/a/n/q;->g:Lcom/orange/oab/contactless/packid/hce/user/User;

    iget-boolean v0, p0, Le/h/d/a/a/n/p;->b:Z

    iget-boolean v1, p0, Le/h/d/a/a/n/q;->h:Z

    const/4 v2, 0x0

    invoke-static {p1, p2, v2, v0, v1}, Le/h/d/a/a/n/r;->a(Le/h/d/a/a/n/r;Lcom/orange/oab/contactless/packid/hce/user/User;Le/h/d/a/a/p/a/a/a;ZZ)V

    return-void
.end method
