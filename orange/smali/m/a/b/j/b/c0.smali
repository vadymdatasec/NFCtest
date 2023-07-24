.class public Lm/a/b/j/b/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;


# direct methods
.method public constructor <init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lm/a/b/j/b/c0;->a:Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "Maximum number of displayed LogRecords: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lm/a/b/j/b/c0;->a:Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;

    iget v1, v1, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
