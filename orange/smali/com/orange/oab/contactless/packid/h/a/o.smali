.class public final Lcom/orange/oab/contactless/packid/h/a/o;
.super Lcom/orange/oab/contactless/packid/h/a/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Z)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statusWord"

    invoke-static {p2, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Z)V

    return-void
.end method
