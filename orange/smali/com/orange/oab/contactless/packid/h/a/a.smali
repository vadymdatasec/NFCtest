.class public Lcom/orange/oab/contactless/packid/h/a/a;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final b:Lfr/mbs/binary/Octets;

.field public final c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, p2, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2
    iput-object p2, p0, Lcom/orange/oab/contactless/packid/h/a/a;->b:Lfr/mbs/binary/Octets;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/h/a/a;->c:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Z)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 6
    iput-object p2, p0, Lcom/orange/oab/contactless/packid/h/a/a;->b:Lfr/mbs/binary/Octets;

    .line 7
    iput-boolean p3, p0, Lcom/orange/oab/contactless/packid/h/a/a;->c:Z

    return-void
.end method


# virtual methods
.method public a()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/h/a/a;->b:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/h/a/a;->c:Z

    return v0
.end method
