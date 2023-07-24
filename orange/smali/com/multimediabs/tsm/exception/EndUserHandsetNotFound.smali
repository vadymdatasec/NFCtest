.class public Lcom/multimediabs/tsm/exception/EndUserHandsetNotFound;
.super Lfr/mbs/tsm/exception/BusinessException;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Unknown handset or no MMI available"

    .line 1
    invoke-direct {p0, v0}, Lfr/mbs/tsm/exception/BusinessException;-><init>(Ljava/lang/String;)V

    return-void
.end method
