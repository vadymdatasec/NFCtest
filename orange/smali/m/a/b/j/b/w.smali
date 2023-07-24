.class public Lm/a/b/j/b/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lorg/apache/log4j/lf5/LogRecord;

.field public final synthetic c:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;


# direct methods
.method public constructor <init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;Lorg/apache/log4j/lf5/LogRecord;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/a/b/j/b/w;->c:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    iput-object p2, p0, Lm/a/b/j/b/w;->b:Lorg/apache/log4j/lf5/LogRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm/a/b/j/b/w;->c:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    iget-object v0, v0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->e:Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->getExplorerModel()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;

    move-result-object v0

    iget-object v1, p0, Lm/a/b/j/b/w;->b:Lorg/apache/log4j/lf5/LogRecord;

    invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->addLogRecord(Lorg/apache/log4j/lf5/LogRecord;)V

    .line 2
    iget-object v0, p0, Lm/a/b/j/b/w;->c:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    iget-object v0, v0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d:Lorg/apache/log4j/lf5/viewer/LogTable;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;

    move-result-object v0

    iget-object v1, p0, Lm/a/b/j/b/w;->b:Lorg/apache/log4j/lf5/LogRecord;

    invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->addLogRecord(Lorg/apache/log4j/lf5/LogRecord;)Z

    .line 3
    iget-object v0, p0, Lm/a/b/j/b/w;->c:Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;

    invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->K()V

    return-void
.end method
